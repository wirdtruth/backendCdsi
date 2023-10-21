package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arcgmo;

@Repository
public interface IArcgmoRepo extends PagingAndSortingRepository<Arcgmo, String> {
	
	@Query("FROM Arcgmo")
	List<Arcgmo> listarMonedas();

}
