package com.cdsi.backend.inve.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Usuac;
import com.cdsi.backend.inve.models.services.IUsuacService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/usuac")
public class UsuacController extends GenericController {
	
	@Autowired
	private IUsuacService servi;
	
	@GetMapping("/id")
	public ResponseEntity<ResponseRest> buscarID(@RequestParam String cia, @RequestParam String usuario) {		
		    try{
	            Object obj = this.servi.buscarId(cia, usuario);
	            if (obj != null){
	                return super.getOKConsultaRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@GetMapping("/activo")
	public ResponseEntity<ResponseRest> buscarCiaAndActivo(@RequestParam String cia, @RequestParam String activo) {		
		    try{
	            Object obj = this.servi.buscarCiaAndActivo(cia, activo);
	            if (obj != null){
	                return super.getOKConsultaRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@PostMapping
	public ResponseEntity<ResponseRest> guardar(@RequestBody Usuac usuac){
		
		 try{
	            Object obj = this.servi.guardar(usuac);
	            if (obj != null){
	                return super.getOKRegistroRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@PutMapping
	public ResponseEntity<ResponseRest> modificar(@RequestBody Usuac usuac){
		
		 try{
	            Object obj = this.servi.actualizar(usuac);
	            if (obj != null){
	                return super.getOKRegistroRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseRest> eliminar(@RequestParam String cia, @RequestParam String usuario) {		
		    try{
	            Object obj = this.servi.buscarId(cia, usuario);
	            if (obj != null){
	            	this.servi.eliminar(cia, usuario);
	                return super.getDeleteRegistroRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}

}
