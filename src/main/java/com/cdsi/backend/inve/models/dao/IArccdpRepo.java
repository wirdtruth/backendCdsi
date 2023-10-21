package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arccdp;
import com.cdsi.backend.inve.models.entity.ArccdpPK;

@Repository
public interface IArccdpRepo extends JpaRepository<Arccdp, ArccdpPK> {
	
	//VAMOS A LISTAR TODOS LOS DEPARTAMENTOS DE UNA COMPAÑIA
	@Query("SELECT a FROM Arccdp a WHERE a.arccdpPK.noCia = :cia")
	List<Arccdp> listarXCia(@Param("cia") String cia);

}
