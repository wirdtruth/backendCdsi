package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arpffe;
import com.cdsi.backend.inve.models.services.IArpffeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arpffe")
public class ArpffeController extends GenericController {

    @Autowired
    private IArpffeService iArpffeService;
    
    //GUARDAMOS LA GUIA DE REMISION
    @PostMapping("/save")
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arpffe arpffe, BindingResult result){
        if (result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object obj = this.iArpffeService.save(arpffe);
            if (obj != null){
                return super.getOKRegistroRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }

    //BUSCAMOS LA GUIA REMISION
    @GetMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestParam String cia,@RequestParam String bodega,@RequestParam String guia){        
        try{
            Object obj = this.iArpffeService.buscarId(cia,bodega,guia);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return super.getErrorRequest();
        }

    }

    @GetMapping("/pagin")
    public ResponseEntity<ResponseRest> pageCia(@RequestParam String cia,@RequestParam int limit, @RequestParam int page){

        try{
            Object obj = this.iArpffeService.pageCia(limit,page,cia);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getErrorRequest();
        }

    }

}
