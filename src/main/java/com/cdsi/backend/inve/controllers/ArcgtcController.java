package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.dto.TipoCambioDTO;
import com.cdsi.backend.inve.models.entity.Arcgcc;
import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.services.IArcgccService;
import com.cdsi.backend.inve.models.services.IArcgtcService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@CrossOrigin(origins = {"*"}, methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/arcgtc")
public class ArcgtcController extends GenericController {
    @Autowired
    private IArcgtcService arcgtcService;
    
    @Autowired
    private IArcgccService arcgccService;
    
    //GURDAR TIPO DE CAMBIO DEL DIA
    @PostMapping("/save")
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arcgtc arcgtc, BindingResult result){
    	if (result.hasErrors()){
			return super.getErrorRequest();
		}
    	try{
			Object obj = this.arcgtcService.save(arcgtc);
			if (obj != null){
				return super.getOKRegistroRequest(obj);
			}else {
				return super.getNotFoundRequest();
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
			return super.getErrorRequest();
		}
    }

    @GetMapping("/listar")
    public ResponseEntity<ResponseRest> listar(){
        try{
            Object obj = this.arcgtcService.getAll();
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            return super.getBadRequest(e.getMessage());
        }
    }

    @GetMapping("/id")
     public ResponseEntity<ResponseRest> buscarId(@RequestParam String clase,@RequestParam String fecha){         
         try{
        	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	 Date f = formato.parse(fecha);
        	 
            Object object = this.arcgtcService.buscarClaseAndFecha(clase,f);
            if (object != null){
                return super.getOKConsultaRequest(object);
            }
            return super.getBadIdRequest();
         }catch (Exception e){
        	 System.out.println(e.getMessage());
             return super.getBadRequest(e.getMessage());
         }

     }

     @GetMapping("/fecha")
     public ResponseEntity<ResponseRest> buscarFecha(@RequestParam String fecha){
         try{
        	 this.arcgtcService.guardarTipoCambioApiSunat();
        	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	 Date f = formato.parse(fecha);
             Object obj = this.arcgtcService.listarXFecha(f);
             if (obj != null){
                 return this.getOKConsultaRequest(obj);
             }
             return this.getBadIdRequest();
         }catch (Exception e){
        	 System.out.println(e.getMessage());
             return super.getBadRequest(e.getMessage());
         }
     }
     
     
     //METODO QUE NOS DEVUELVE EL TIPO DE CAMBIO DTO
     @GetMapping("/fechadto")
     public ResponseEntity<ResponseRest> listarFecha(@RequestParam String fecha){
    	 try{
        	 this.arcgtcService.guardarTipoCambioApiSunat();
        	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	 Date f = formato.parse(fecha);
        	 
        	 List<Arcgtc> arcgtcList = this.arcgtcService.listarXFecha(f);
        	 List<Arcgcc> arcgccList = this.arcgccService.mostrarTodos();
        	 
        	 List<TipoCambioDTO> tipoCambioDtoList = new ArrayList<>();
        	       	 
        	 for(Arcgtc arcgtc: arcgtcList) {
        		 String c1 = arcgtc.getArcgtcPK().getClaseCambio();
        		 for(Arcgcc arcgcc: arcgccList) {
        			 //System.out.println("ENTRO :::::::::::::::::::::::::::::::::::::::"+arcgcc.getClaseCambio()+" ::: "+arcgtc.getArcgtcPK().getClaseCambio());
        			 String c2 = arcgcc.getClaseCambio();
        			 if( c1.equals(c2) ) {
        				  //System.out.println("clase 1 : "+c1+" , clase 2 : "+c2);
        				  TipoCambioDTO tcDTO = new TipoCambioDTO();
        				  tcDTO.setClase(c1);
        				  tcDTO.setDescripcion(arcgcc.getDescripcion());
        				  tcDTO.setMonto(arcgtc.getTipoCambio());
        				  tipoCambioDtoList.add(tcDTO);
        				  break;
        			 }
        		 }        		         		 
        	 }

        	 Object obj = tipoCambioDtoList;
             if (obj != null){
                 return this.getOKConsultaRequest(obj);
             }
             return this.getBadIdRequest();
         }catch (Exception e){
        	 System.out.println(e.getMessage());
             return super.getBadRequest(e.getMessage());
         }
     }

     @GetMapping("/page")
     public ResponseEntity<ResponseRest> paginacion(@RequestParam int limit, @RequestParam int page){
         try{
             Object obj = this.arcgtcService.pageArcgtc(limit,page);
             if (obj != null){
                 return super.getOKConsultaRequest(obj);
             }
             return super.getBadIdRequest();
         }catch (Exception e){
        	 System.out.println(e.getMessage());
             return super.getBadRequest(e.getMessage());
         }
     }

}
