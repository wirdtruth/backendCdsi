package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfacf;
import com.cdsi.backend.inve.models.entity.ArfacfPK;
import com.cdsi.backend.inve.models.services.IArfacfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arfacf")
public class ArfacfController extends GenericController {

    @Autowired
    private IArfacfService arfacfService;
    
    @PutMapping("/update")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody Arfacf arfacf, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.arfacfService.ingrementarCorreFicta(arfacf);
            if (obj != null){
                return super.getUpdateRegistroRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }

    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody ArfacfPK arfacfPK, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.arfacfService.buscarId(arfacfPK);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }

    @GetMapping("/page")
    public ResponseEntity<ResponseRest> pageCia(@RequestParam String cia,@RequestParam int limit,@RequestParam int page){

        try{
            Object lst = this.arfacfService.pageCia(limit, page, cia);//  pagiCia(limit,page,cia);
            if (lst != null){
                return super.getOKConsultaRequest(lst);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return  super.getBadRequest(e.getMessage());
        }

    }

}
