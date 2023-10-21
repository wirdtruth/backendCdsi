package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.entity.ArfafePK;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArfafeRepo extends PagingAndSortingRepository<Arfafe, ArfafePK> {

    @Query("SELECT a FROM Arfafe a WHERE a.arfafePK.noCia = :cia AND a.arfafePK.tipoDoc = :doc  AND a.IND_PVENT = :pven " +
            "ORDER BY a.FECHA DESC")
    public List<Arfafe> listaDocumentoElectronicos(@Param("cia") String cia,@Param("doc") String doc,@Param("pven") String pven);
	
	@Query("SELECT a FROM Arfafe a WHERE a.arfafePK.noCia = :cia AND a.CENTRO = :centro AND a.ALMACEN_REF = :bodega"
			+ " AND a.TIPO_DOC_ALMA = :tipDoc AND a.NO_REFE_ALMA = :noDocu AND a.NO_CLIENTE = :noCli AND a.arfafePK.tipoDoc = 'NC' "
			+ " AND a.ESTADO IN('D','G') ")
	Arfafe getExisteArinme1(@Param("cia") String cia, @Param("centro") String centro, @Param("bodega") String bodega, @Param("tipDoc") String tipDoc, 
			@Param("noDocu") String noDocu, @Param("noCli") String noCli);
	
	@Query("SELECT a FROM Arfafe a WHERE a.arfafePK.noCia = :cia AND a.arfafePK.tipoDoc = :tipo AND a.ESTADO = :estado")
	List<Arfafe> listaByCiaTipDocEstado(@Param("cia") String cia, @Param("tipo") String tipo, @Param("estado") String estado );

    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia")
    Page<Arfafe> pageCia(Pageable pageable, @Param("cia") String cia);

    //OBTENER TODAS LAS FACTURAS
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia and a.IND_PVENT = :indPvent")
    public Page<Arfafe> buscarCiaAndIndPvent(Pageable pageable, @Param("cia") String cia, @Param("indPvent") String indPvent);

    //OBTENER TODAS LAS FACTURAS X Cliente
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia AND a.IND_PVENT = :indPvent AND a.NO_CLIENTE = :cliente")
    Page<Arfafe> buscarCiaAndIndPventAndNoCliente(Pageable pageable, @Param("cia") String cia, @Param("indPvent") String indPvent,
                                                  @Param("cliente") String noCliente);

    //OBTENER TODAS LAS FACTURAS - factura en ptovta
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia AND a.IND_PVENT = :indPvent AND a.arfafePK.noFactu = :factu")
    Page<Arfafe> buscarCiaAndIndPventAndNoFactu(Pageable pageable, @Param("cia") String cia, @Param("indPvent") String indPvent,
                                                  @Param("factu") String noFactu);

    //OBTENER FACTURA
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia AND a.arfafePK.tipoDoc = :doc AND a.arfafePK.noFactu = :factu")
    public Arfafe buscarId(@Param("cia") String cia, @Param("doc") String tipoDoc, @Param("factu") String noFactu);
    
    //LISTAR FACTURAS 2 MESES - PVTA
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia and IND_PVENT = :pven and tipo_doc= :doc "
    		+ "and FECHA BETWEEN :f1 and :f2 and NO_FACTU = nvl( :fac,NO_FACTU)")
    public List<Arfafe> listArfafePventa(@Param("cia") String cia,@Param("pven") String pven, @Param("doc") String doc,
    		@Param("f1") String f1, @Param("f2") String f2, @Param("fac") String fac);

}
