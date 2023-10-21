package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cdsi.backend.inve.models.entity.ArtstrdPVen;

public interface IArtstrdPVenRepo extends CrudRepository<ArtstrdPVen, Long> {

	@Query("SELECT a FROM ArtstrdPVen a where a.artstrdPVenPK.noCia = :cia AND "
			+ "a.artstrdPVenPK.tipoDoc = :doc AND a.artstrdPVenPK.noFactu = :factu")
	ArtstrdPVen buscar(@Param("cia") String cia, @Param("doc") String tipoDoc, @Param("factu") String noFactu);
	
}
