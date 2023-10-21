package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfatp;
import com.cdsi.backend.inve.models.entity.IdArfatp;

@Repository
public interface IArfatpDao extends PagingAndSortingRepository<Arfatp,IdArfatp> {
	
	//VAMOS A TRAER TODAS LAS SUB LINEAS DE UN ARTICULO
	@Query("SELECT a FROM Arfatp a  WHERE a.idArfa.cia = :cia AND a.indPtovta = :pv")
	List<Arfatp> findAll(@Param("cia") String cia,@Param("pv") String pv);
	
}
