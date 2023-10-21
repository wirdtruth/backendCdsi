package com.cdsi.backend.inve.models.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arobtt;
import com.cdsi.backend.inve.models.entity.BasucCred;

@Repository
public interface ISPArobttRepo extends CrudRepository<Arobtt, Long>{
	
	@Procedure(name = "crear_nc_ci")
	String crearNcCi(@Param("wno_cia") String wno_cia, @Param("wbodega") String wbodega, @Param("wtipo_doc") String wtipo_doc,
		@Param("wno_docu") String wno_docu, @Param("wcliente") String wcliente,@Param("wtipo_refe_factu") String wtipo_refe_factu,
		@Param("wno_refe_factu") String wno_refe_factu, @Param("wcod_tienda") String wcod_tienda, @Param("wmoneda") String wmoneda, 
		@Param("wmotivo_nc") String wmotivo_nc, @Param("wsustento") String wsustento, @Param("wcentro") String wcentro, @Param("wserie") String wserie);
	
	@Procedure(name = "cxc_artstrd_pven")
	String paseCxcPven(@Param("PNO_CIA") String cia, @Param("ptipo_m") String tipo_m, @Param("pcentro") String centro,
		@Param("pcod_ven_cob") String pcod_ven, @Param("pno_cliente") String cli,@Param("ptipo_doc") String tDoc,
		@Param("pcod_doc") String codDoc, @Param("pno_docu") String noDoc, @Param("pmoneda_doc") String pMon, 
		@Param("pimporte_doc") String total, @Param("pfecha_doc") String fechaDoc, @Param("ptipo_cambio_doc") BigDecimal tc,
		@Param("pfecha_vence") String fechaVence, @Param("pTIPO_DOC_EMP") String tDocEmp, @Param("pNUM_DOC_EMP") String docEmp,
		@Param("pconvenio") String pConv, @Param("pIND_FERIAS") String indFerias);
	
	@Query("SELECT a FROM BasucCred a WHERE a.basucCredPk.noCia = :cia AND a.basucCredPk.codSuc = :suc")
	BasucCred consultaBcred(@Param("cia") String cia, @Param("suc") String suc);
}
