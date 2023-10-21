package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arccpr;
import com.cdsi.backend.inve.models.entity.ArccprPK;

@Repository
public interface IArccprRepo extends JpaRepository<Arccpr, ArccprPK> {
	
	//VAMOS A BUSCAR PROVINCIA POR DEPARTAMENTO
	@Query("SELECT a FROM Arccpr a WHERE a.arccprPK.noCia = :cia AND a.arccprPK.codiDepa = :dp")
	List<Arccpr> listarProvinciaXCiaAndDepar(@Param("cia") String cia,@Param("dp") String dp);

}
