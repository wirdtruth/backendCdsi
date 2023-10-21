package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArcgmoRepo;
import com.cdsi.backend.inve.models.entity.Arcgmo;
import com.cdsi.backend.inve.models.services.IArcgmoService;

@Service
public class ArcgmoServiImple implements IArcgmoService {
	@Autowired
	private IArcgmoRepo arcgRepo;
	
	@Override
	public List<Arcgmo> listarMonedas() {
		// TODO Auto-generated method stub
		return this.arcgRepo.listarMonedas();
	}

}
