package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdsi.backend.inve.models.entity.Arfacr;
import com.cdsi.backend.inve.models.entity.ArfacrPK;
import org.springframework.data.repository.query.Param;

public interface IArfacrRepo extends JpaRepository<Arfacr, ArfacrPK> {
	
	@Query("SELECT a FROM Arfacr a WHERE a.arfacrPK.noCia = :cia")
	List<Arfacr> listaCia(@Param("cia") String cia);

}
