package com.cdsi.backend.inve.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.cdsi.backend.inve.models.entity.Empresa;
import com.cdsi.backend.inve.models.entity.Persona;
import com.google.gson.Gson;

public class RucDniSunat {

  //METODO QUE NOS PERMITE CONSULTAR POR RUC
  public Empresa consultarRuc(String ruc) {
	  Empresa empresa = null;
		try {
			
			URL url = new URL("https://api.apis.net.pe/v1/ruc?numero="+ruc);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
          //conn.setRequestProperty("Authorization", "Bearer "+token);
          
          if (conn.getResponseCode() != 200) {
          	System.out.println("=) ... ENTRO AL ERROR RUC ::::::::::::::::");
              throw new RuntimeException("Failed : HTTP Error code : "+ conn.getResponseCode());
          }
          InputStreamReader in = new InputStreamReader(conn.getInputStream());
          BufferedReader br = new BufferedReader(in);
          
          //VAMOS A CONVERITR DE JSON A UN OBJETO
          Gson gson = new Gson();
          empresa = gson.fromJson(br.readLine(), Empresa.class);           
          
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return empresa;
  }
	
  //METODO QUE NOS PERMITE CONSULAR POR DNI
  public Persona consultarDni(String dni) {
	  Persona persona = null;
		try {			
		  URL url = new URL("https://api.apis.net.pe/v1/dni?numero="+dni);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
          conn.setRequestMethod("GET");
          conn.setRequestProperty("Accept", "application/json");
        //conn.setRequestProperty("Authorization", "Bearer "+token);        
        if (conn.getResponseCode() != 200) {
        	System.out.println("=) ... ENTRO AL ERROR RUC ::::::::::::::::");
            throw new RuntimeException("Failed : HTTP Error code : "+ conn.getResponseCode());
        }
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);        
        //VAMOS A CONVERITR DE JSON A UN OBJETO
        Gson gson = new Gson();
        persona = gson.fromJson(br.readLine(), Persona.class);        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return persona;
  }
  
  
}
