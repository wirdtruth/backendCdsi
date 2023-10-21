package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.ITapfopaService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/tapfopa")
public class TapfopaController extends GenericController {
	
	@Autowired
	private ITapfopaService tapfopaService;
	
	@GetMapping
	public ResponseEntity<ResponseRest> listarCiaAndEstado(@RequestParam String cia, @RequestParam String estado){
		 try{        	 
            Object object = this.tapfopaService.listaCiaAndEstado(cia, estado);
            if (object != null){
                return super.getOKConsultaRequest(object);
            }
            return super.getBadIdRequest();
         }catch (Exception e){             
             return super.getBadRequest(e.getMessage());
         }
	}
	

}
