package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Artsopp;
import com.cdsi.backend.inve.models.entity.ArtsoppPK;
import java.util.List;

@Repository
public interface IArtsoppRepo extends PagingAndSortingRepository<Artsopp, ArtsoppPK> {
	
	@Query("SELECT a FROM Artsopp a where a.artsoppPk.noCia = :cia")
	List<Artsopp> listar(@Param("cia") String cia);

}
