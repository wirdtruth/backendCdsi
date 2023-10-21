package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.entity.ArfafePK;
import com.cdsi.backend.inve.models.services.IArfafeService;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arfafe")
public class ArfafeController extends GenericController {

    @Autowired
    private IArfafeService iArfafeService;
    
    @GetMapping(value ="/nc/pdf", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> reporteNotaCredito(@RequestParam String cia,@RequestParam String sucursal,
    		                                         @RequestParam String tipoDoc,@RequestParam String noFactu){
       // try {
        	byte[] data = null;
        	data = this.iArfafeService.generarReporteNotaCredito(cia, sucursal, tipoDoc, noFactu);
            return new ResponseEntity<byte[]>(data, HttpStatus.OK);
        /*} catch(Exception e) {
            System.out.println(e.getMessage());            
        }*/
    }

    @GetMapping("/nc")
    public ResponseEntity<ResponseRest> listaNotasCredito(@RequestParam String cia,
                                                          @RequestParam String doc, @RequestParam String pven){
        try {
            Object o = this.iArfafeService.listaDocumentosElectronicosNc(cia, doc, pven);
            if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getNotFoundRequest();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return super.getErrorRequest();
        }
    }
    
    @GetMapping("/documento")
    public ResponseEntity<ResponseRest> listaByCiaAndTipoDocAndEstado(@RequestParam String cia, 
    		                            @RequestParam String tipo, @RequestParam String estado){
    	try {    		
    		Object o = this.iArfafeService.listaByCiaAndTipDocAndEstado(cia, tipo, estado);
    		if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getNotFoundRequest();
    		
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		return super.getErrorRequest();
    	}
    }

    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody ArfafePK arfafePK, BindingResult result){
        if(result.hasErrors()){
            return super.getErrorRequest();
        }
        try {
            Object o = this.iArfafeService.buscarId(arfafePK.getNoCia(), arfafePK.getTipoDoc(), arfafePK.getNoFactu());
            if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return super.getErrorRequest();
        }
    }
    
    @GetMapping("/listas/{cia}/{pven}/{doc}")
    public List<Arfafe> listarArfafe(@PathVariable("cia") String cia, @PathVariable("pven") String pven, 
    		@PathVariable("doc") String doc, @RequestParam("f1") String f1, @RequestParam("f2") String f2
    		, @RequestParam("fac") String fac){
    	return this.iArfafeService.listarFacturasPvta(cia, pven, doc, f1, f2, fac);
    }
    
    @GetMapping("/list")
    public ResponseEntity<ResponseRest> listarTodo(@RequestParam String cia, BindingResult result){
		if(result.hasErrors()){
            return super.getBadRequest(result);
        }
    	try {
    		//return new ResponseEntity<List<Arfafe>>(this.iArfafeService.buscarCiaAndIndPvent(1, 15, cia, "N"), HttpStatus.OK);
    		Object o = this.iArfafeService.buscarCiaAndIndPvent(1, 15, cia, "N");
    		if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getBadIdRequest();
    		
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		return super.getErrorRequest();
    	}
    }

    @PostMapping("save")
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arfafe arfafe, BindingResult result){
    	if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
        	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        	arfafe.setFECHA(sdf.format(Date.from(Instant.parse(arfafe.getFECHA()))));
        	arfafe.setFECHA_VENCE(sdf.format(Date.from(Instant.parse(arfafe.getFECHA_VENCE()))));
            Object o = this.iArfafeService.save(arfafe);
            if (o != null){
                return super.getOKRegistroRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<ResponseRest> actualizar(@RequestBody Arfafe arfafe, BindingResult result){
        if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object o = this.iArfafeService.save(arfafe);
            if (o != null){
                return super.getUpdateRegistroRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }
}
