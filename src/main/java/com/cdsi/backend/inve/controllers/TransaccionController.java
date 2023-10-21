package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.ITransaccionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/trans")
public class TransaccionController extends GenericController {
    @Autowired
    private ITransaccionService iTransaccionService;

    @GetMapping("/{cia}/{user}")
    public ResponseEntity<ResponseRest> listar(@PathVariable("cia") String cia, @PathVariable("user") String user){
        try {
            Object obj = this.iTransaccionService.findByCiaAndUser(cia,user);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getNotFoundRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getErrorRequest();
        }
    }
}
