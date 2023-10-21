package com.cdsi.backend.inve.controllers;

import java.math.BigDecimal;

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
import com.cdsi.backend.inve.dto.NotaCreditoCi;
import com.cdsi.backend.inve.models.services.ISPArobttService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/SPUtils")
public class ISPArobttController extends GenericController {
	
	@Autowired
	private ISPArobttService serv;
	
	@PostMapping("/nc/ci")
    public ResponseEntity<ResponseRest> crearNcCi(@RequestBody NotaCreditoCi ncci, BindingResult result ){
        try {
        	if(result.hasErrors()){
                return super.getErrorRequest();
            }
            Object obj = this.serv.crearNcCI(ncci.getWnocia(), ncci.getWbodega(), ncci.getWtipodoc(), ncci.getWnodocu(), ncci.getWcliente(), ncci.getWtiporefefactu(),
            		ncci.getWnorefefactu(), ncci.getWcodtienda(), ncci.getWmoneda(), ncci.getWmotivonc(), ncci.getWsustento(), ncci.getWcentro(),ncci.getWserie());
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getNotFoundRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getErrorRequestMessage(e.getMessage());
        }
    }
	
	@GetMapping("/PaseCxcPven")
    public ResponseEntity<ResponseRest> crear(@RequestParam String cia, @RequestParam String tipo_m, @RequestParam String centro, 
    		@RequestParam String pcod_ven, @RequestParam String cli,@RequestParam String tDoc,
    		@RequestParam String codDoc, @RequestParam String noDoc, @RequestParam String pMon, @RequestParam String total, 
    		@RequestParam String fechaDoc, @RequestParam BigDecimal tc, @RequestParam String fechaVence, 
    		@RequestParam String tDocEmp, @RequestParam String docEmp, @RequestParam String pConv, @RequestParam String indFerias){
        try {
            Object obj = serv.PaseCxcPven(cia, tipo_m, centro, pcod_ven, cli, tDoc, codDoc, noDoc, pMon, total, fechaDoc, 
            								tc, fechaVence, tDocEmp, docEmp, pConv, indFerias);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getNotFoundRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getErrorRequestMessage(e.getMessage());
        }
    }
	
	@GetMapping("/Bcred")
	public ResponseEntity<ResponseRest> consultaBcred(@RequestParam String cia, @RequestParam String suc){
		try {
			Object obj = serv.consultaBcred(cia, suc);
			if (obj != null) return super.getOKConsultaRequest(obj);
			return super.getNotFoundRequest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return super.getErrorRequestMessage(e.getMessage());
		}
	}

}
