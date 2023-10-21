package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.ArtstrdPVen;
import com.cdsi.backend.inve.models.entity.ArtstrdPVenPK;
import com.cdsi.backend.inve.models.services.ArtstrdPVenService;
import com.cdsi.backend.inve.models.services.IArtsoppService;
import com.cdsi.backend.inve.models.services.IArtsttropiService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/ArtstrdPven")
public class ArtstrdPVenController extends GenericController {
	
	@Autowired
	private ArtstrdPVenService service;
	
	@Autowired
	private IArtsoppService serv1;
	
	@Autowired
	private IArtsttropiService serv2;
	
	@PostMapping("/search")
	public ResponseEntity<ResponseRest> buscar(@RequestBody ArtstrdPVenPK dataPk, BindingResult result){
        if(result.hasErrors()){
            return super.getErrorRequest();
        }
        try {
            Object o = this.service.buscar(dataPk.getNoCia(), dataPk.getTipoDoc(), dataPk.getNoFactu());
            if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return super.getErrorRequest();
        }
    }
	
    @PostMapping("/save")
    public ResponseEntity<ResponseRest> guardar(@RequestBody ArtstrdPVen obj, BindingResult result){
    	if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object o = this.service.save(obj);
            if (o != null){
                return super.getOKRegistroRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }
    
    @GetMapping("/artsopp")
    public ResponseEntity<ResponseRest> listarArtsopp(@RequestParam String cia){
    	try {
    		Object o = this.serv1.listar(cia);
    		if(o != null) {
    			return this.getOKConsultaRequest(o);
    		}
    		return super.getBadIdRequest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return super.getBadRequest(e.getMessage());
		}
    }
    
    @GetMapping("/Artsttropi")
    public ResponseEntity<ResponseRest> listarArtsttropi(@RequestParam String cia){
    	try {
    		Object o = this.serv2.listar(cia);
    		if(o != null) {
    			return this.getOKConsultaRequest(o);
    		}
    		return super.getBadIdRequest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return super.getBadRequest(e.getMessage());
		}
    }


}
