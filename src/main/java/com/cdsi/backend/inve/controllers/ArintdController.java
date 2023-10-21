package com.cdsi.backend.inve.controllers;


import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.models.services.IArintdService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arintd")
public class ArintdController extends GenericController {
	
	@Autowired
	private IArintdService servi;
	
	@GetMapping("/id")
	public ResponseEntity<ResponseRest> findArintd(@RequestParam String cia,@RequestParam String trans){
		
		try {
    		//return new ResponseEntity<List<Arfafe>>(this.iArfafeService.buscarCiaAndIndPvent(1, 15, cia, "N"), HttpStatus.OK);
    		Object o = this.servi.getCiaAndTransa(cia, trans);
    		if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getBadIdRequest();
    		
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		return super.getErrorRequest();
    	}
		
	}
	

}
