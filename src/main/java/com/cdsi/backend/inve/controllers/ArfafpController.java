package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfafp;
import com.cdsi.backend.inve.models.entity.ArfafpPK;
import com.cdsi.backend.inve.models.services.IArfafpService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@Slf4j
@RestController
@RequestMapping("/api/fpago")
public class ArfafpController  extends GenericController {
    @Autowired
    private IArfafpService iArfafpService;

    @PostMapping("/id")
    public  ResponseEntity<ResponseRest> buscarId(@RequestBody ArfafpPK arfafpPK, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.iArfafpService.buscarId(arfafpPK);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }

    @PostMapping
    public ResponseEntity<ResponseRest> listarCiaAndEstado(@RequestBody Arfafp arfafp, BindingResult result){

        if (result.hasErrors()){
            return super.getErrorRequest();
        }

        try{
            Object obj = this.iArfafpService.findByCiaAndEstado(arfafp.getArfafpPK().getNoCia(),arfafp.getEstado());
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	log.error(e.getMessage());
            return super.getErrorRequest();
        }

    }
}
