package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.dao.exception.ExceptionRepository;
import com.cdsi.backend.inve.models.entity.Arfafp;
import com.cdsi.backend.inve.models.entity.ArfafpPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArfafpRepo extends PagingAndSortingRepository<Arfafp, ArfafpPK> {

    //VAMOS A BUSCAR POR CIA Y ESTADO ACTIVO
    @Query("SELECT a FROM Arfafp a where a.arfafpPK.noCia = :cia and a.estado = :estado")
    List<Arfafp> listarCiaAndEstado(@Param("cia") String cia,@Param("estado") String estado) throws ExceptionRepository;

    //VAMOS A BUSCAR UNA FORMA DE PAGO
    @Query("SELECT a FROM Arfafp a where a.arfafpPK.noCia = :cia and a.arfafpPK.codFpago = :codFpago and a.arfafpPK.tipoFpago = :tipoFpago")
    Arfafp buscarId(@Param("cia") String cia, @Param("codFpago") String codFpago , @Param("tipoFpago") String tipoFpago) throws ExceptionRepository;

}
