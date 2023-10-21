package com.cdsi.backend.inve.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.exception.ModeloNotFoundException;
import com.cdsi.backend.inve.models.entity.TapUsuPven;
import com.cdsi.backend.inve.models.services.ITapUsuPvenService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/usuarios")
public class TapUsuPvenController {

	@Autowired
	private ITapUsuPvenService service;
	
	@GetMapping("/usuario/{cia}/{emp}")
	public ResponseEntity<TapUsuPven> listarPorId(@PathVariable("cia") String cia,@PathVariable("emp") String emp) throws Exception{
		
		// List<TapUsuPven> obj = new ArrayList<>();
		TapUsuPven obj = service.listarPorId(cia,emp);
		if(obj == null ) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + emp);
		}		
		return new ResponseEntity<TapUsuPven>(obj, HttpStatus.OK);
	}
	@GetMapping("/cajeros/{cia}/{centro}")
	public ResponseEntity<List<TapUsuPven>> listaCajeros(@PathVariable("cia") String cia,@PathVariable("centro") String centro) throws Exception{
		List<TapUsuPven> obj = new ArrayList<>();
		obj = service.listarCajeros(cia,centro);
		return new ResponseEntity<List<TapUsuPven>>(obj, HttpStatus.OK);
	}
}
