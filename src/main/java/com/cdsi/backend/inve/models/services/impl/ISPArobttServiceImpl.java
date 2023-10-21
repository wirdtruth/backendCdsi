package com.cdsi.backend.inve.models.services.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.dao.ISPArobttRepo;
import com.cdsi.backend.inve.models.entity.BasucCred;
import com.cdsi.backend.inve.models.services.ISPArobttService;

@Repository
public class ISPArobttServiceImpl implements ISPArobttService {
	
	@Autowired
	private ISPArobttRepo repo;

	@Override
	public String crearNcCI(String wno_cia, String wbodega, String wtipo_doc, String wno_docu, String wcliente,
			String wtipo_refe_factu, String wno_refe_factu, String wcod_tienda, String wmoneda, String wmotivo_nc,
			String wsustento, String wcentro,String wserie) {
		// TODO Auto-generated method stub
		return this.repo.crearNcCi(wno_cia, wbodega, wtipo_doc, wno_docu, wcliente, wtipo_refe_factu, wno_refe_factu,
				wcod_tienda, wmoneda, wmotivo_nc, wsustento, wcentro,wserie);
	}
	
	@Override
	public String PaseCxcPven(String cia, String tipo_m, String centro, String pcod_ven, String cli, String tDoc,
			String codDoc, String noDoc, String pMon, String total, String fechaDoc, BigDecimal tc, String fechaVence,
			String tDocEmp, String docEmp, String pConv, String indFerias) {
		return repo.paseCxcPven(cia, tipo_m, centro, pcod_ven, cli, tDoc, codDoc, noDoc, pMon, total, 
				fechaDoc, tc, fechaVence, tDocEmp, docEmp, pConv, indFerias);
	}

	@Override
	public BasucCred consultaBcred(String cia, String suc) {
		return repo.consultaBcred(cia, suc);
	}
	
}
