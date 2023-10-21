package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfatcn;
import com.cdsi.backend.inve.models.entity.ArfatcnPK;

@Repository
public interface IArfatcnRepo extends JpaRepository<Arfatcn, ArfatcnPK> {
	
	@Query("SELECT a.arfatcnPK.tipo FROM Arfatcn a WHERE a.arfatcnPK.noCia = :cia AND a.indDetalle = :indDet")
	List<String> listaCiaAndIndDeta(@Param("cia") String cia, @Param("indDet") String indDet);
	
	@Query("SELECT a.arfatcnPK.tipo FROM Arfatcn a WHERE a.arfatcnPK.noCia = :cia AND a.indDetalle = :ind")
	List<String> listaTipoFromCiaAndIndDetalle(@Param("cia") String cia, @Param("ind") String ind);
}
