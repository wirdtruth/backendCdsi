package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArcgccRepo;
import com.cdsi.backend.inve.models.entity.Arcgcc;
import com.cdsi.backend.inve.models.services.IArcgccService;

@Service
public class ArcgccServiceImple implements IArcgccService {
	@Autowired
	private IArcgccRepo repo;

	@Override
	public List<Arcgcc> mostrarTodos() {
		// TODO Auto-generated method stub
		return this.repo.mostrarTodos();
	}

    
}
