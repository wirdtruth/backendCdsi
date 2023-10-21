package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arinum;
import com.cdsi.backend.inve.models.entity.ArinumPK;

@Repository
public interface ArinumRepo extends JpaRepository<Arinum, ArinumPK> {
	
	// VAMOS A LISTAR LAS UNIDADES POR COMPAÑIA CON ESTADO ACTIVO
	@Query("FROM Arinum a WHERE a.arinumPK.noCia = :cia AND a.estado = :estado")
	List<Arinum> listarXcia(@Param("cia") String cia, @Param("estado") String estado );

}
