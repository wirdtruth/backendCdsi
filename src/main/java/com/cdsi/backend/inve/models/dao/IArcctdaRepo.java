package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.ArcctdaEntity;
import com.cdsi.backend.inve.models.entity.ArcctdaPKEntity;

@Repository
public interface IArcctdaRepo extends JpaRepository<ArcctdaEntity, ArcctdaPKEntity> {
	
	@Query("SELECT a FROM ArcctdaEntity a WHERE a.arcctdaPKEntity.noCia = :cia AND a.arcctdaPKEntity.noCliente = :noCli")
	List<ArcctdaEntity> listaDirecLegal(@Param("cia") String cia, @Param("noCli") String noCli);

}
