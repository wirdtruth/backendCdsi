package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arccdi;
import com.cdsi.backend.inve.models.entity.ArccdiPK;

@Repository
public interface IArccdiRepo extends JpaRepository<Arccdi, ArccdiPK> {
	
	//VAMOS A LISTAR DISTRITOS POR DEPARTAMENTO Y PROVINCIA
	@Query("SELECT a FROM Arccdi a WHERE a.arccdiPK.noCia = :cia AND a.arccdiPK.codiDepa = :dp AND a.arccdiPK.codiProv = :pr ")
	List<Arccdi> listarDistritoXCiaAndDepartAndProvi(@Param("cia") String cia, @Param("dp") String dp,@Param("pr") String pr);

}
