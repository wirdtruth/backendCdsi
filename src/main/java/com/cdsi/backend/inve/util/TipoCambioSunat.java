package com.cdsi.backend.inve.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;

import com.cdsi.backend.inve.models.entity.Sunattc;
import com.google.gson.Gson;

public class TipoCambioSunat {
	
	public Sunattc getTipoCambio() {
		Sunattc sunattc = null;
		try {
			//String token = "apis-token-1.aTSI1U7KEuT-6bbbCguH-4Y8TI6KS73N";
			LocalDate fecha = LocalDate.now();			
			
			URL url = new URL("https://api.apis.net.pe/v1/tipo-cambio-sunat?fecha="+fecha);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            //conn.setRequestProperty("Authorization", "Bearer "+token);           
            if (conn.getResponseCode() != 200) {
            	System.out.println("=) ... ENTRO AL ERROR ::::::::::::::::");
                throw new RuntimeException("Failed : HTTP Error code : "+ conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);            
            //VAMOS A CONVERITR DE JSON A UN OBJETO
            Gson gson = new Gson();
            sunattc = gson.fromJson(br.readLine(), Sunattc.class);           
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return sunattc;
	}

}
