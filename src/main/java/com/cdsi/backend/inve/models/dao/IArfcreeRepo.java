package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfcree;
import com.cdsi.backend.inve.models.entity.ArfcreePK;

@Repository
public interface IArfcreeRepo extends PagingAndSortingRepository<Arfcree, ArfcreePK> {
	
	@Query("Select a From Arfcree a where a.arfcreePk.noCia = :cia and a.arfcreePk.noOrden = :orden and a.arfcreePk.noCliente = :cli")
	Arfcree buscar(@Param("cia") String noCia, @Param("orden") String noOrden, @Param("cli") String noCliente);

}
