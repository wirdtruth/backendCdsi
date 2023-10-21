package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdsi.backend.inve.models.services.IArinbo1Service;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arinbo1")
public class Arinbo1Controller extends GenericController {
	
	@Autowired
	private IArinbo1Service arinServ;

	//LISTAR TODOS LOS ALMACENES DE UNA EMPRESA
	@GetMapping("/list")
	public ResponseEntity<ResponseRest> listaArinbo1Xcia(@RequestParam String cia) {
		try{
			Object obj = this.arinServ.findAll(cia);
			if (obj != null){
				return super.getOKConsultaRequest(obj);
			}
			return super.getBadIdRequest();
		}catch (Exception e){
			System.out.println(e.getMessage());
			return super.getErrorRequest();
		}
	}

	//LISTAR TODOS LOS ALMACENES DE UNA EMPRESA por su BODEGA
	@GetMapping("/bodega")
	public ResponseEntity<ResponseRest> getArinbo1XciaAndBodega(@RequestParam String cia, @RequestParam String bodega) {
		try{
			Object obj = this.arinServ.findArinbo1XCiaAndAlmacen(cia, bodega);
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
