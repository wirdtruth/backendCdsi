package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arfatp;

public interface IArfatpService {
	List<Arfatp> findAll(String cia, String pv);
}
