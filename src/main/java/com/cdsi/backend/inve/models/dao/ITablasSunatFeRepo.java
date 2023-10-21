package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.cdsi.backend.inve.models.entity.TablasSunatFe;

public interface ITablasSunatFeRepo extends PagingAndSortingRepository<TablasSunatFe, Long> {
	
	@Query("select a from TablasSunatFe a where a.clase = :clase and a.codigo <> '99999999'")
	List<TablasSunatFe> listar(@Param("clase") String clase);

}
