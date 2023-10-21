package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfcree;
import com.cdsi.backend.inve.models.entity.ArfcreePK;
import com.cdsi.backend.inve.models.services.IArfcreeService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arfcree")
public class ArfcreeController extends GenericController {
	
	@Autowired
	private IArfcreeService iArfcreeService;
	
	@PostMapping("/id")
	public ResponseEntity<ResponseRest> buscar(@RequestBody ArfcreePK arfcreePk, BindingResult result){
		try {
			if(result.hasErrors()) {
				return super.getErrorRequest();
			}
			Object obj = this.iArfcreeService.buscar(arfcreePk.getNoCia(), arfcreePk.getNoOrden(), arfcreePk.getNoCliente());
			if( obj != null) {
				return super.getOKConsultaRequest(obj);
			}
			return super.getBadIdRequest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return super.getErrorRequest();
		}
	}
	
	@PostMapping("save")
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arfcree arfcree, BindingResult result){
    	if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object o = this.iArfcreeService.save(arfcree);
            if (o != null){
                return super.getOKRegistroRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }

}
