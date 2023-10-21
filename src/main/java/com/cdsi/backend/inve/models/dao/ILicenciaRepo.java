package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Licencia;
import com.cdsi.backend.inve.models.entity.LicenciaPK;

@Repository
public interface ILicenciaRepo extends JpaRepository<Licencia, LicenciaPK> {
	
	//BUSCAMOS LA LICENCIA DE LA EMPRESA
	@Query("FROM Licencia a WHERE a.licenciaPK.noCia = :cia")
	Licencia buscarCia(@Param("cia") String cia);

}
