package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arcgcan;
import com.cdsi.backend.inve.models.entity.ArcgcanPK;
import com.cdsi.backend.inve.models.services.IArcgcanService;

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
@RestController
@RequestMapping("/api/trans")
public class ArcgcanController extends GenericController {
    @Autowired
    private IArcgcanService iArcgcanService;

    //METODO QUE NOS PERMITE BUSCAR UN CENTRO DE COSTO
    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody ArcgcanPK arcgcanPK, BindingResult result) {
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.iArcgcanService.buscarId(arcgcanPK);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	
            System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }

    //VAMOS A TRAER TODOS LOS CENTROS DE COSTO
    @PostMapping("/listar")
    public ResponseEntity<ResponseRest> listar(@RequestBody Arcgcan arcgcan, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.iArcgcanService.listarByCiaAndEstado(arcgcan);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }

}
