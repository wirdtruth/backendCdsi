package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.ITapfopaRepo;
import com.cdsi.backend.inve.models.entity.Tapfopa;
import com.cdsi.backend.inve.models.services.ITapfopaService;

@Service
public class TapfopaServImpl implements ITapfopaService {
	
	@Autowired
	private ITapfopaRepo tapfopaRepo;

	@Override
	public List<Tapfopa> listaCiaAndEstado(String cia, String estado) {
		return this.tapfopaRepo.buscarCiaAndEstado(cia, estado);
	}

}
