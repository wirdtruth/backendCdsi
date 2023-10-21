package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arobtt;

@Repository
public interface IFileFeSpRepo extends CrudRepository<Arobtt, Long> {
	
	@Procedure(name = "crear_file_plano_fe")
    String respestaCrearFilePlanoFe(@Param("PCIA") String PCIA, @Param("PCOD_SUC") String PCOD_SUC, 
    		@Param("PTIP_DOCU") String PTIP_DOCU, @Param("PNRO_DOCU") String PNRO_DOCU);

}
