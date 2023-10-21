package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.ArfaccPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArfaccRepo extends PagingAndSortingRepository<Arfacc, ArfaccPK> {
    
	@Query("SELECT a FROM Arfacc a WHERE a.arfaccPK.noCia = :cia AND a.arfaccPK.centro = :centro AND a.arfaccPK.tipoDoc = :tipoDoc AND a.arfaccPK.serie = :serie ")
	Arfacc buscarId(@Param("cia") String cia, @Param("centro") String centro,@Param("tipoDoc") String tipoDoc, @Param("serie") String serie );

    //METODO QUE NOS PERMITE OBTENER EL CORRELATIVO DE LAS SERIES DE FACTU
    @Query("SELECT a FROM Arfacc a WHERE a.arfaccPK.noCia = :cia AND a.arfaccPK.tipoDoc = :tipoDoc "
    		+ "AND a.arfaccPK.centro = :centro AND a.activo = :activo")
    List<Arfacc> buscarCiaAndTipDocAndCentroAndActivo(@Param("cia") String cia, @Param("tipoDoc") String tipoDoc,
    		@Param("centro") String centro, @Param("activo") String activo);

    //METODO QUE TRAE TODAS LAS SERIES DE PUNTO DE VENTA Y FACTURACION
    @Query("SELECT a FROM Arfacc a WHERE a.arfaccPK.noCia = :cia")
    Page<Arfacc> listarCia(@Param("cia") String cia, Pageable pageable);

    //METODO QUE NOS PERMITE VER TODAS LAS SERIES DE PUNTO DE VENTA Y FACTU CON ESTADO
    @Query("SELECT a FROM Arfacc a WHERE a.arfaccPK.noCia = :cia AND a.activo = :activo")
    Page<Arfacc> listarCiaAndActivo(@Param("cia ") String cia, @Param("activo") String activo,Pageable pageable);

    @Query("SELECT a FROM Arfacc a WHERE a.arfaccPK.noCia = :cia AND a.arfaccPK.tipoDoc = :tipoDoc")
    Page<Arfacc> listarCiaAndTipoDoc(@Param("cia") String cia, @Param("tipoDoc") String tipoDoc, Pageable pageable);

    //METODO QUE NOS PERMITE OBTENER EL CORRELATIVO DE LAS SERIES DE FACTU
    @Query("SELECT a FROM Arfacc a WHERE a.arfaccPK.noCia = :cia AND a.arfaccPK.centro = :centro")
    Page<Arfacc> listarCiaAndCentro(@Param("cia") String cia, @Param("centro") String centro, Pageable pageable);

}
