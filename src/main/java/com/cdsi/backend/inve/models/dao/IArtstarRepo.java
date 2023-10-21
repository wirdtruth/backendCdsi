package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Artstar;
import com.cdsi.backend.inve.models.entity.ArtstarPK;

@Repository
public interface IArtstarRepo extends PagingAndSortingRepository<Artstar, ArtstarPK> {
	
	@Query("SELECT a FROM Artstar a WHERE a.artstarPk.cia = :cia")
	List<Artstar> listar(@Param("cia") String cia);

}
