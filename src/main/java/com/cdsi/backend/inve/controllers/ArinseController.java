package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arinse;
import com.cdsi.backend.inve.models.services.IArinseService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arinse")
public class ArinseController extends GenericController{
	
	@Autowired
	private IArinseService servi;
	
	//ACTUALIZAR CONSECUTIVO PARA EL NO_DOCU
	@PutMapping
	public ResponseEntity<ResponseRest> actualizar(@RequestBody Arinse arinse, BindingResult result){
		if (result.hasErrors()){
			return super.getBadRequest(result);
		}
		try{
			Object obj = this.servi.aumentarSecuencia(arinse);
			if (obj != null){
				return super.getUpdateRegistroRequest(obj);
			}
			return super.getNotFoundRequest();
		}catch (Exception e){
			System.out.println(e);
			return super.getNotFoundRequest();
		}
	}
	
	//METODO QUE NOS PERMITE TRAER EL NO DOCU
	@GetMapping("/id")
	public ResponseEntity<ResponseRest> getNoDocu(@RequestParam String cia,@RequestParam String bodega,@RequestParam String tran){
		try {
			Object obj = this.servi.getCiaAndBodegaAndTrans(cia, bodega, tran);
			if (obj == null){
				return super.getNotFoundRequest();
			}
			return super.getOKConsultaRequest(obj);
		}catch (Exception e){
			System.out.println(e.getMessage());
			return super.getErrorRequest();
		}

	}

}
