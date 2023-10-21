package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfadoc;
import com.cdsi.backend.inve.models.entity.ArfadocPK;

@Repository
public interface IArfadocRepo extends JpaRepository<Arfadoc, ArfadocPK> {
    
	@Query("SELECT a FROM Arfadoc a WHERE a.arfadocPK.noCia = :cia AND a.estado = :estado")
	List<Arfadoc> listaByCiaAndEstado(@Param("cia") String cia, @Param("estado") String estado);
}
