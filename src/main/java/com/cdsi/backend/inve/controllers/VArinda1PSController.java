package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IVArinda1PSService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/vaps")
public class VArinda1PSController extends GenericController {
	
	@Autowired
	private IVArinda1PSService ivarinda1psServi;
	
	@GetMapping("/buscar")
	public ResponseEntity<ResponseRest> listaItemsCiaAndListPrecio(@RequestParam String cia, @RequestParam String desc ,@RequestParam String lp){
		try{       	 
	           Object object = this.ivarinda1psServi.listaItemCiaAndListaPrecioAndDescripcion(cia, lp, desc);
	           if (object != null){
	               return super.getOKConsultaRequest(object);
	           }
	           return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
	}
	
	@GetMapping("/page")
	public ResponseEntity<ResponseRest> pageItemsCiaAndListPrecio(@RequestParam String cia, @RequestParam String lp,@RequestParam int limit, @RequestParam int page){
		try{  			
	           Object object = this.ivarinda1psServi.pagListaItemCiaAndListaPrecio(limit, page, cia, lp);
	           if (object != null){
	               return super.getOKConsultaRequest(object);
	           }
	           return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
	}

}
