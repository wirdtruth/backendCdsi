package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArcgmoService;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arcgmo")
public class ArcgmoController extends GenericController {
  @Autowired
  private IArcgmoService arcgServi;
  
  @GetMapping
  public ResponseEntity<ResponseRest> listar(){
      try{
          Object obj = this.arcgServi.listarMonedas();
          if (obj != null){
              return super.getOKConsultaRequest(obj);
          }
          return super.getBadIdRequest();
      }catch (Exception e){
          return super.getBadRequest(e.getMessage());
      }
  }
  
}
