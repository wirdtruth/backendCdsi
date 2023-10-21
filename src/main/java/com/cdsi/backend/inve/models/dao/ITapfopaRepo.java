package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Tapfopa;
import com.cdsi.backend.inve.models.entity.TapfopaPK;

@Repository
public interface ITapfopaRepo extends PagingAndSortingRepository<Tapfopa, TapfopaPK> {
	
	//METODO PARA TRAER LA FORMA DE PAGO CON EL ESTADO ACTIVO PARA PUNTO DE VENTA
	@Query("SELECT a FROM Tapfopa a WHERE a.tapfopaPK.noCia = :cia AND a.estado = :estado")
	List<Tapfopa> buscarCiaAndEstado(@Param("cia") String cia, @Param("estado") String estado);
	
}
