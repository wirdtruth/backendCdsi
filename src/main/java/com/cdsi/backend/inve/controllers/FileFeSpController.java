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
import com.cdsi.backend.inve.models.services.IFileFeSpService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/fe")
public class FileFeSpController extends GenericController {
	@Autowired
	private IFileFeSpService service;
	
	@GetMapping
    public ResponseEntity<ResponseRest> listar(@RequestParam String cia, @RequestParam String suc,
    		@RequestParam String tip,  @RequestParam String docu){
        try {
            Object obj = this.service.respestaCrearFilePlanoFe(cia, suc, tip, docu);
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
