package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.SpMaesCampana;
import com.cdsi.backend.inve.models.entity.SpMaesCampanaPK;
import com.cdsi.backend.inve.models.services.IspMaesCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("campana")
public class SpMaesCampanaController  extends GenericController {
    @Autowired
    public IspMaesCampService ispMaesCampService;

    @PostMapping("/list")
    public ResponseEntity<ResponseRest> listarCampana(@RequestBody SpMaesCampana spMaesCampana, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.ispMaesCampService.listaCampanaActivas(spMaesCampana.getSpMaesCampanaPK().getNroCia(),spMaesCampana.getEstado());
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getNotFoundRequest();
        }catch (Exception e){
            System.out.println(e);
            return super.getErrorRequest();
        }

    }

    //VAMOS A OPTENER UNA CAMPAÑA CON EL ESTADO ACTIVO
    @PostMapping("/id")
    public ResponseEntity<ResponseRest> findByCiaAndCampana(@RequestBody SpMaesCampanaPK spMaesCampanaPK, BindingResult result){

        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.ispMaesCampService.findByCiaAndCamp(spMaesCampanaPK);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            System.out.println(e);
            return super.getErrorRequest();
        }

    }

}
