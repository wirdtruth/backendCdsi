package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.services.IArfaccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arfacc")
public class ArfaccController extends GenericController {

    @Autowired
    private IArfaccService iArfaccService;
    
    @GetMapping("/serieDocu")
    public ResponseEntity<ResponseRest> listaSerieDocumentos(@RequestParam String cia,@RequestParam String tipDoc, @RequestParam String centro, @RequestParam String activo){
        try{ // String cia, String tipoDoc, String centro, String activo
            Object obj = this.iArfaccService.listaSerieDocumento(cia, tipDoc, centro, activo);            
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getNotFoundRequest();
        }catch (Exception e){
            return super.getBadRequest(e.getMessage());
        }
    }
    
    //METODO QUE NOS PERMITE TRAER LAS SERIE Y CORRELATIVO
    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody Arfacc arfacc, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }

        try {
            Object obj = this.iArfaccService.buscarCiaAndTipDocAndCentroAndActivo(arfacc);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            
            return super.getBadRequest(e.getMessage());
        }

    }
    
    //NOS PERMITE CREAR UNA NUEVA SERIE Y CORRELATIVO
    @PostMapping("/save")
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arfacc arfacc, BindingResult result){
        if (result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object obj = this.iArfaccService.save(arfacc);
            if (obj != null){
            	return super.getOKRegistroRequest(obj);
                //return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	
            return super.getBadRequest(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<ResponseRest> actualizar(@RequestBody Arfacc arfacc, BindingResult result){
        if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object obj = this.iArfaccService.actualizar(arfacc.getArfaccPK(),arfacc);
            if (obj != null){
                return super.getUpdateRegistroRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	
            return super.getBadRequest(e.getMessage());
        }

    }
}
