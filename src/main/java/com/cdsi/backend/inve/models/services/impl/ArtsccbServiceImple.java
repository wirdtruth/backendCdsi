package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArtsccbRepo;
import com.cdsi.backend.inve.models.entity.Artsccb;
import com.cdsi.backend.inve.models.services.IArtsccbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtsccbServiceImple implements IArtsccbService {

    @Autowired
    private IArtsccbRepo repo;

    @Override
    public Artsccb getArtsccbCiaAndCaja(String cia,String tipo, String caja) {
        return this.repo.getArtsccbXCiaAndCaja(cia, tipo, caja);
    }

	@Override
	public Artsccb cajaUsuario(String cia, String tipo, String centro, String responsable) {
		// TODO Auto-generated method stub
		return this.repo.cajaUsuario(cia, tipo, centro, responsable);
	}
}
