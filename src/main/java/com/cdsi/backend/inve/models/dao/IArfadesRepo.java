package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfades;

@Repository
public interface IArfadesRepo extends CrudRepository<Arfades, Long> {
	
	@Procedure(name = "file_plano_fe_anulacion")
    String respestaCrearFilePlanoFe(@Param("PCIA") String PCIA, @Param("PTIPO_DOC") String PTIPO_DOC,
    		@Param("PNO_FACTU") String PNO_FACTU, @Param("PDESC") String PDESC);

}
