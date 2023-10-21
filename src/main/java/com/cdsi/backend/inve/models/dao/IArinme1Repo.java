package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArinme1Repo extends PagingAndSortingRepository<Arinme1, Arinme1PK> {
	
	@Query("SELECT a FROM Arinme1 a WHERE a.arinme1PK.noCia = :cia AND a.noCliente = :noCli AND a.estado = 'D' "
			+ "ORDER BY a.fecha DESC")
	List<Arinme1> listaComprobIngreso(@Param("cia") String cia, @Param("noCli") String noCli);

    @Query("SELECT a FROM Arinme1 a WHERE a.arinme1PK.noCia = :cia AND a.noCliente = :noCli AND a.centro = :centro "
    		+ " AND a.arinme1PK.bodega = :bodega AND a.arinme1PK.tipoDoc = :tipoDoc AND a.arinme1PK.noDocu = :noDocu "
    		+ " AND a.noGuiaRefe IS NOT NULL AND a.corrDocRec2 IS NULL AND a.estado = 'D' ")
    Arinme1 getExistencia(@Param("cia") String cia, @Param("noCli") String noCli, @Param("centro") String centro,
    		@Param("bodega") String bodega,@Param("tipoDoc") String tipoDoc,@Param("noDocu") String noDocu);
    
	//BUSCAR POR CODIGO
	@Query("SELECT a FROM Arinme1 a WHERE a.arinme1PK.noCia = :cia AND a.arinme1PK.bodega = :bodega AND a.arinme1PK.tipoDoc = :tipoDoc "
			+ "AND a.arinme1PK.noDocu = :noDocu")
    Arinme1 buscarId(@Param("cia") String cia,@Param("bodega") String bodega,@Param("tipoDoc") String tipoDoc,@Param("noDocu") String noDocu);

    @Query("SELECT a FROM Arinme1 a WHERE a.arinme1PK.noCia = :cia")
    Page<Arinme1> buscarCia(@Param("cia") String cia, Pageable pageable);
    
}
