package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArccdpRepo;
import com.cdsi.backend.inve.models.entity.Arccdp;
import com.cdsi.backend.inve.models.services.IArccdpService;

@Service
public class ArccdpServiImple implements IArccdpService {
	@Autowired
	private IArccdpRepo repo;

	@Override
	public List<Arccdp> listarDepartamentoXCia(String cia) {
		// TODO Auto-generated method stub
		return this.repo.listarXCia(cia);
	}

}
