package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arinse;
import com.cdsi.backend.inve.models.entity.ArinsePK;

@Repository
public interface IArinseRepo extends JpaRepository<Arinse, ArinsePK> {
	
	//VAMOS A BUSCAR LA SECUENCIA
	@Query("SELECT a FROM Arinse a WHERE a.arinsePK.noCia = :cia AND a.arinsePK.bodega = :bodega AND a.arinsePK.tipoDoc = :tipoDoc")
	public Arinse getCiaAndBodegaAndTrans(@Param("cia") String cia,@Param("bodega") String bodega,@Param("tipoDoc") String tipoDoc);

}
