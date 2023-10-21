package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfamc;
import com.cdsi.backend.inve.models.services.IArfamcService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/company")
public class ArfamcController extends GenericController {
	
	@Autowired
	private IArfamcService servi;
	
	@GetMapping
    public ResponseEntity<ResponseRest> getCia(@RequestParam String cia){
        try {
            Object obj = this.servi.finById(cia);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getNotFoundRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getErrorRequestMessage(e.getMessage());
        }
    }
	
	@PutMapping
	public ResponseEntity<ResponseRest> modificar(@RequestBody Arfamc arfamc) {
		try {
			Arfamc obj = this.servi.actualizar(arfamc);
			if(obj != null ) {
				return super.getUpdateRegistroRequest(obj);	
			}
			return super.getNotFoundRequest();
		}catch (Exception e){
	    	System.out.println(e.getMessage());
	        return super.getErrorRequestMessage(e.getMessage());
	    }
	}

}
