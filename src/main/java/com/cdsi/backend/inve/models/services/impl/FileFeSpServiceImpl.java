package com.cdsi.backend.inve.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IFileFeSpRepo;
import com.cdsi.backend.inve.models.services.IFileFeSpService;

@Service
public class FileFeSpServiceImpl implements IFileFeSpService {
	
	@Autowired
	private IFileFeSpRepo repo;

	@Override
	public String respestaCrearFilePlanoFe(String cia, String suc, String tipo, String docu) {
		// TODO Auto-generated method stub
		return this.repo.respestaCrearFilePlanoFe(cia, suc, tipo, docu);
	}

}
