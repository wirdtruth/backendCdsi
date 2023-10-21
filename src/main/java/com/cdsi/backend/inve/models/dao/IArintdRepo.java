package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arintd;
import com.cdsi.backend.inve.models.entity.ArintdPK;

@Repository
public interface IArintdRepo extends JpaRepository<Arintd, ArintdPK> {
	
	//VAMOS A TRAER LA BODEGAS POR TRANSACCION Y COMPAÑIA
	@Query("SELECT a FROM Arintd a WHERE a.arintdPK.noCia = :cia AND a.arintdPK.tipoM = :tipoM")
	public Arintd getCiaAndTransac(@Param("cia") String cia,@Param("tipoM") String tipoM);
	
	//VAMOS A TRAER LA BODEGAS POR TRANSACCION Y COMPAÑIA
	@Query("SELECT a FROM Arintd a WHERE a.arintdPK.noCia = :cia")
	public List<Arintd> listaCia(@Param("cia") String cia);
	
	//CONSULTAMOS TODAS LAS TRANSACCIONES DE DEVOLUCION CON NOTA DE CREDITO
	@Query("SELECT a.arintdPK.tipoM FROM Arintd a WHERE a.arintdPK.noCia = :cia AND a.indNotaCred = :indnc")
	public List<String> listaTransDevoluByCiaAndIndNC(@Param("cia") String cia, @Param("indnc") String indnc);

}
