package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arinbo1;
import com.cdsi.backend.inve.models.entity.Arinbo1PK;

@Repository
public interface IArinbo1Dao extends PagingAndSortingRepository<Arinbo1, Arinbo1PK> {
	
	//VAMOS A TRAER TODAS LAS SUB LINEAS DE UN ARTICULO
	@Query("SELECT a FROM Arinbo1 a WHERE a.arinbo1PK.noCia = :cia")
	List<Arinbo1> findAll(@Param("cia") String cia);

	// METODO QUE NOS DEVOLVERA UN ALMACEN
	@Query("SELECT a FROM Arinbo1 a WHERE a.arinbo1PK.noCia = :cia AND a.arinbo1PK.codigo = :bodega")
	Arinbo1 findArinbo1XciaAndBodega(@Param("cia") String cia, @Param("bodega") String bodega);

}
