package com.cdsi.backend.inve.models.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arcaaccaj;
import com.cdsi.backend.inve.models.entity.IdArcaaccaj;

@Repository
public interface IArcaaccajDao extends JpaRepository<Arcaaccaj, IdArcaaccaj> {
	
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro= :centro AND a.cajera = :cajera AND a.estado = :estado")
	List<Arcaaccaj> buscarCajaAbierta(@Param("cia") String cia, @Param("centro") String centro, @Param("cajera") String cajera, @Param("estado") String estado);
	
	//VER SI EL CAJERO TIENE UNA CAJA ABIERTA EN UNA FECHA
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro= :centro AND a.cajera = :cajera AND a.estado = :estado and  a.fecha BETWEEN TO_DATE(:fec1,'DD/MM/YYYY HH24:MI') and TO_DATE(:fec2,'DD/MM/YYYY HH24:MI')")
	List<Arcaaccaj> verificarCajaAbierta(@Param("cia") String cia, @Param("centro") String centro, @Param("cajera") String cajera, @Param("estado") String estado, @Param("fec1") String fec1, @Param("fec2") String fec2);
	
	// @Param("centro") String centro, @Param("caja") String caja, @Param("cod") String cod
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro=:centro AND a.idArcaja.codCaja=:caja AND a.idArcaja.codAper=:cod")
	Arcaaccaj buscarID(@Param("cia") String cia,@Param("centro") String centro, @Param("caja") String caja, @Param("cod") String cod);

	@Query(value = "SELECT F_COD_APERTURA(:cia,:fecha) FROM DUAL", nativeQuery = true)
	String codigoAperturaCaja(@Param("cia") String cia,@Param("fecha") Date fecha);

	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro=:centro AND a.idArcaja.codCaja=:caja AND a.estado='A' AND a.cajera=:cajera")
	Arcaaccaj buscarCaja(@Param("cia")String cia, @Param("centro") String centro, @Param("caja") String caja, @Param("cajera") String cajera);
	
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro=:centro AND a.estado='A' AND a.cajera=:cajera")
	List<Arcaaccaj> caja(@Param("cia")String cia, @Param("centro") String centro, @Param("cajera") String cajera);
	
	@Query("FROM Arcaaccaj a WHERE a.idArcaja.cia = :cia AND a.idArcaja.centro=:centro AND a.fecha BETWEEN :fecha AND :fechaSgte")
	List<Arcaaccaj> totalCajas(@Param("cia")String cia, @Param("centro") String centro,Date fecha,@Param("fechaSgte") Date fechaSgte);
	
	@Query(value = "SELECT  a.NO_CABA, a.DESC_CABA, a.MONEDA FROM artsccb a WHERE a.no_cia = :cia AND a.tipo_caba = 'C' AND a.centro = :centro and a.no_caba not in(Select cod_caja from ARCAACCAJ where no_cia = :cia and centro = :centro and estado='A')", nativeQuery = true)
	List<Object[]> listaCajas(@Param("cia")String cia, @Param("centro") String centro);
	
}
