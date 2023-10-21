package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arobtt;

@Repository
public interface IEstadoRepo extends JpaRepository<Arobtt, Long> {
    @Query(value = "SELECT CONTA.F_ESTADO_DOC(:tipDoc,:estado) FROM DUAL", nativeQuery = true)
    public String nombreEstado(@Param("tipDoc") String tipDoc, @Param("estado") String estado);
}
