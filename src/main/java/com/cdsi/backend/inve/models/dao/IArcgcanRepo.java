package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.dao.exception.ExceptionRepository;
import com.cdsi.backend.inve.models.entity.Arcgcan;
import com.cdsi.backend.inve.models.entity.ArcgcanPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArcgcanRepo extends PagingAndSortingRepository<Arcgcan, ArcgcanPK> {

    @Query("SELECT a FROM Arcgcan a where a.arcgcanPK.noCia = :cia and a.estado = :estado " +
            "and a.arcgcanPK.tipoAnalitico = '01' and a.indMov = '1'")
    List<Arcgcan> listaCiaAndEstado(@Param("cia") String cia, @Param("estado") String estado) throws ExceptionRepository;

    @Query("SELECT a FROM Arcgcan a where a.arcgcanPK.tipoAnalitico = :tipoAnalitico and a.arcgcanPK.noCia = :cia " +
            "and a.arcgcanPK.codAnalitico = :codAnalitico")
    Arcgcan buscarId(@Param("tipoAnalitico") String tipoAnalitico, @Param("cia") String cia, @Param("codAnalitico") String codAnalitico) throws ExceptionRepository;
}
