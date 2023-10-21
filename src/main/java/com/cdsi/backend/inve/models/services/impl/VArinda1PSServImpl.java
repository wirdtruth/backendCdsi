package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IVArinda1PSRepo;
import com.cdsi.backend.inve.models.entity.VArinda1PS;
import com.cdsi.backend.inve.models.services.IVArinda1PSService;

@Service
public class VArinda1PSServImpl implements IVArinda1PSService {
	@Autowired
	private IVArinda1PSRepo ivarinda1psRepo;

	@Override
	public List<VArinda1PS> listaItemCiaAndListaPrecioAndDescripcion(String cia, String lp, String desc) {
		return this.ivarinda1psRepo.listaItemsXCiaAndListPrecAndDescrip(cia, lp, desc);
	}

	@Override
	public Page<VArinda1PS> pagListaItemCiaAndListaPrecio(int limit, int page, String cia, String lp) {
		 Pageable pageable = PageRequest.of(page, limit);
         return this.ivarinda1psRepo.pagListaItemXCiaAndListaPrecio(pageable, cia, lp);
	}

	@Override
	public List<VArinda1PS> listaItemCiaAndListaPrecio(String cia, String lp) {
		return this.ivarinda1psRepo.listaItemsXCiaAndLisPrecio(cia, lp);
	}

	

}
