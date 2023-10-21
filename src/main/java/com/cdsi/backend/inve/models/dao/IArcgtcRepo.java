package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.entity.ArcgtcPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IArcgtcRepo extends PagingAndSortingRepository<Arcgtc, ArcgtcPK> {

    @Query("SELECT a FROM Arcgtc  a WHERE a.arcgtcPK.claseCambio = :clase and a.arcgtcPK.fecha = :fecha")
    Arcgtc buscarClaseAndFecha(@Param("clase") String clase,@Param("fecha") Date fecha);

    //METODO QUE NOS TRAE EL TIPO DE CAMBIO DE UNA FECHA
    @Query("SELECT a FROM Arcgtc  a WHERE a.arcgtcPK.fecha = :fecha")
    List<Arcgtc> buscarXFecha(@Param("fecha") Date fecha);

    @Query("SELECT a FROM Arcgtc a")
    List<Arcgtc> listar();

    @Query("select a from Arcgtc a")
    Page<Arcgtc> pageArcgtc(Pageable pageable);

}
