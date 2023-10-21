package com.cdsi.backend.inve.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.dto.DatosCajaDTO;
import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.entity.IdArcaaccaj;
import com.cdsi.backend.inve.models.services.IArcaaccajService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/apercaja")
public class ArcaaccajController extends GenericController {

	@Autowired
	private IArcaaccajService service;

	@PostMapping
	public ResponseEntity<ResponseRest> registrar(@Valid @RequestBody Arcaaccaj caja){
		
		 try{
	            Object obj = this.service.aperturaCaja(caja);
	            if (obj != null){
	                return super.getOKRegistroRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@GetMapping("/id")
	public ResponseEntity<ResponseRest> getID(@RequestParam String cia, @RequestParam String centro, @RequestParam String caja, @RequestParam String cod) {		
		    try{
	            Object obj = this.service.buscarID(cia, centro, caja, cod);
	            if (obj != null){
	                return super.getOKConsultaRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@GetMapping("/vericaja")
	public ResponseEntity<ResponseRest> verificarCajaAbiertas(@RequestParam String cia, @RequestParam String centro,
			    @RequestParam String cajera, @RequestParam String estado, @RequestParam String fecha) {		
		    try{
		    	Object obj2 = this.service.buscarCajaAbierta(cia, centro, cajera, estado);
		    	if(obj2 != null) {
		    		return super.getOKConsultaRequest(obj2);
		    	}else {
		            Object obj = this.service.verificarCajaAbierta(cia, centro, cajera, estado, fecha);
		            if (obj != null){
		                return super.getOKConsultaRequest(obj);
		            }
		    	}
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	
	@PutMapping
	public ResponseEntity<Arcaaccaj> modifical(@Valid @RequestBody Arcaaccaj caja) throws Exception {
		
		Arcaaccaj obj = service.actualizaCaja(caja);

		return new ResponseEntity<Arcaaccaj>(obj,HttpStatus.OK);
	}

	@PostMapping("/valida/caja")
	public ResponseEntity<Arcaaccaj> cajaActual(@RequestBody DatosCajaDTO dto) throws Exception{

		Arcaaccaj obj = service.buscarCaja(dto);
		if (obj == null) {
			throw new ModeloNotFoundException("CAJA NO APERTURADA " + dto.getCaja());
		}
		return new ResponseEntity<Arcaaccaj>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/traerCaja")
	public ResponseEntity<Arcaaccaj> cajaSeleccionada(@RequestBody IdArcaaccaj id) throws Exception{

		Arcaaccaj obj = service.findById(id);
		if (obj == null) {
			throw new ModeloNotFoundException("CAJA NO APERTURADA " + id.getCodCaja());
		}
		return new ResponseEntity<Arcaaccaj>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/caja")
	public ResponseEntity<List<Arcaaccaj>> caja(@RequestBody DatosCajaDTO dto) throws Exception{

		List<Arcaaccaj> obj = new ArrayList<>();
				obj = service.caja(dto);
		/*if (obj == new ArrayList<Arcaaccaj>()) {
			throw new ModeloNotFoundException("NO HAY CAJA ASIGNADA" + dto.getCajera());
		}*/
		return new ResponseEntity<List<Arcaaccaj>>(obj, HttpStatus.OK);
	}
	
	@PostMapping("/total")
	public ResponseEntity<List<Arcaaccaj>> totalCajas(@RequestBody DatosCajaDTO dto) throws Exception{

		List<Arcaaccaj> obj = service.totalCajas(dto);
		
		return new ResponseEntity<List<Arcaaccaj>>(obj, HttpStatus.OK);
	}
	@PostMapping("/eliminar")
	public ResponseEntity<Void> eliminar(@RequestBody IdArcaaccaj id) throws Exception{
		Arcaaccaj obj = service.findById(id);
		if(obj.getIdArcaja() == null ) {
			throw new ModeloNotFoundException("ID de caja"+id.getCodCaja()+"no encontrado" + id.getCodAper());
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	/*
	@GetMapping("/{cia}/{centro}")
	public ResponseEntity<List<CajaDTO>> listaCajas(@PathVariable("cia")String cia,@PathVariable("centro")String centro) throws Exception{
		List<CajaDTO> obj = service.listaCajas(cia, centro);
	
		return new ResponseEntity<List<CajaDTO>>(obj,HttpStatus.OK);
	}*/
}
