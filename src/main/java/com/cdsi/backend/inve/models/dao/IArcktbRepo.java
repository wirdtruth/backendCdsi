package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arcktb;

@Repository
public interface IArcktbRepo extends PagingAndSortingRepository<Arcktb, Long> {
	
	@Query("SELECT a FROM Arcktb a WHERE a.estado = 'A'")
	List<Arcktb> listar();

}
