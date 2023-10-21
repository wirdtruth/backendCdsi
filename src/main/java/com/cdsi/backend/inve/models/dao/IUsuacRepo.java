package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Usuac;
import com.cdsi.backend.inve.models.entity.UsuacPK;

@Repository
public interface IUsuacRepo extends JpaRepository<Usuac, UsuacPK>{
  
	//CONSULTAMOS LOS USUARIOS ACTIVOS EN EL SISTEMA
	@Query("FROM Usuac a WHERE a.usuacPK.noCia = :cia AND a.activo = :activo")
	List<Usuac> buscarUsuarioActivos(@Param("cia") String cia, @Param("activo") String activo);
	//FIN
}
