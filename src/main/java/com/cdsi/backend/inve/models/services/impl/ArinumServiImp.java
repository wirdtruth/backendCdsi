package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.ArinumRepo;
import com.cdsi.backend.inve.models.entity.Arinum;
import com.cdsi.backend.inve.models.services.IArinumService;

@Service
public class ArinumServiImp implements IArinumService {
	
	@Autowired
	private ArinumRepo repo;

	@Override
	public List<Arinum> listarXciaAndEstado(String cia, String estado) {
		// TODO Auto-generated method stub
		return this.repo.listarXcia(cia, estado);
	}

}
