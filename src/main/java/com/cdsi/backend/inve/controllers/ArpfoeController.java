package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.services.IArpfoeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arpfoe")
public class ArpfoeController extends GenericController {

    @Autowired
    private IArpfoeService iArpfoeService;
    
    @GetMapping("/pv")
    public ResponseEntity<ResponseRest> listarPV(@RequestParam String cia,@RequestParam String indPven,
    		@RequestParam String fec1,@RequestParam String fec2){
        try{
            Object obj = this.iArpfoeService.listarPedidosPV(cia, indPven, fec1, fec2);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return super.getErrorRequest();
        }
    }

    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestParam String cia, @RequestParam String cod){
        
        try{
            Object obj = this.iArpfoeService.buscarId(cia, cod);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
     
            return super.getErrorRequest();
        }
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arpfoe arpfoe, BindingResult result){
        if (result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object obj = this.iArpfoeService.save(arpfoe);
            if (obj != null){
                return super.getOKRegistroRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	
            return super.getBadRequest(e.getMessage());
        }

    }

    @PutMapping
    public ResponseEntity<ResponseRest> actualizar(@RequestBody Arpfoe arpfoe, BindingResult result){
        if (result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object obj = this.iArpfoeService.save(arpfoe);
            if (obj != null){
                return super.getUpdateRegistroRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            
            return super.getBadRequest(e.getMessage());
        }

    }

}
