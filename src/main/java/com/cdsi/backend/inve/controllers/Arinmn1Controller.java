package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arinmn1;
import com.cdsi.backend.inve.models.services.IArinmn1Service;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arinmn1")
public class Arinmn1Controller extends GenericController {
		@Autowired
		private IArinmn1Service servi;
	
	   @GetMapping("/id")
	    public ResponseEntity<ResponseRest> buscarId(@RequestParam String cia,@RequestParam String bodega,
	    		@RequestParam String trans,@RequestParam String docu,@RequestParam String arti){
	        try{	        	
	            Object obj = this.servi.listarId(cia, bodega, trans, docu, arti);
	            if (obj != null){
	                return super.getOKConsultaRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	            System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }

	    }
	   
	   @GetMapping
	    public ResponseEntity<ResponseRest> listarTodos(){
	        try{	        	
	            Object obj = this.servi.getAll();
	            if (obj != null){
	                return super.getOKConsultaRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	            System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }

	    }
	   
	    //METODO QUE NOS PERMITE GURADAR
	    @PostMapping("/save")
	    public ResponseEntity<ResponseRest> guardar(@RequestBody Arinmn1 arinmn1, BindingResult result){
	    	if(result.hasErrors()) {
	    		return super.getErrorRequest();
	    	}
	    	try {	    	    
	    	    	Object obj2 = this.servi.save(arinmn1);
	    	    	if(obj2 != null) {
	    	    		return super.getOKRegistroRequest(obj2);
	    	    	}
	    	    	return super.getBadIdRequest();
	    	    
	    	}catch(Exception e) {
	    		System.out.println(e.getMessage());
	    		return super.getBadRequest(e.getMessage());
	    	}
	    	
	    }

}
