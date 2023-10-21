package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.SpMaesCampana;
import com.cdsi.backend.inve.models.entity.SpMaesCampanaPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IspMaesCampanaRepo extends PagingAndSortingRepository<SpMaesCampana, SpMaesCampanaPK> {
    //VAMOS A TRAER LAS CAMPAÑES CON EL ESTADO ACTIVO
    @Query("SELECT a FROM SpMaesCampana a WHERE a.spMaesCampanaPK.nroCia = :cia AND a.estado = :estado")
    List<SpMaesCampana> listaCampanaActivas(@Param("cia") String cia , @Param("estado") String estado);

    @Query("SELECT a FROM SpMaesCampana a WHERE a.spMaesCampanaPK.nroCia = :cia AND a.spMaesCampanaPK.codiCamp = :camp AND a.estado = 'A'")
    SpMaesCampana findByCiaAndCamp(@Param("cia") String cia,@Param("camp") String camp);
}
