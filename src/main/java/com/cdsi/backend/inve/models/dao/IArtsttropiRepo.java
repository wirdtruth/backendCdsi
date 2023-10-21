package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Artsttropi;
import com.cdsi.backend.inve.models.entity.ArtsttropiPK;

@Repository
public interface IArtsttropiRepo extends PagingAndSortingRepository<Artsttropi, ArtsttropiPK> {
	
	@Query("SELECT a FROM Artsttropi a where a.artsttropiPK.noCia = :cia")
	List<Artsttropi> listar(@Param("cia") String cia);

}