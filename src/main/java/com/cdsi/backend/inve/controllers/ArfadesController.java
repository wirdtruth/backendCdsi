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
import com.cdsi.backend.inve.models.services.IArfadesService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/anulacion")
public class ArfadesController extends GenericController {
	
	@Autowired
	private IArfadesService servi;
	
	@GetMapping
    public ResponseEntity<ResponseRest> anulaacion(@RequestParam String cia, @RequestParam String tipDocu,
    		@RequestParam String noFactu,  @RequestParam String descrip){
        try {
            Object obj = this.servi.archivo_anulacion_fe(cia, tipDocu, noFactu, descrip);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getNotFoundRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getErrorRequestMessage(e.getMessage());
        }
    }

}
