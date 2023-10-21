package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.dto.StockLibroDTO;

@Repository
public interface ArticuloStockDao extends JpaRepository<StockLibroDTO, String> {

	@Query("SELECT a FROM StockLibroDTO a WHERE a.cia = :cia AND a.almacen = :almacen AND a.tipo = :tipo")
	List<StockLibroDTO> listaCiaAndBodegaAndTipo(@Param("cia") String cia, @Param("almacen") String almacen, @Param("tipo") String tipo );
	
	List<StockLibroDTO> findByCiaAndCatalogoAndAlmacenAndTipo(@Param("cia") String cia,
			@Param("cat") String cat, @Param("alm") String alm, @Param("pre") String pre);
	
	List<StockLibroDTO> findByCiaAndCatalogoAndLineaAndAlmacenAndTipo(@Param("cia") String cia,
			@Param("cat") String cat, @Param("lin") String lin, @Param("pre") String pre, @Param("alm") String alm);

	List<StockLibroDTO> findByCiaAndCatalogoAndLineaAndSubLineaAndAlmacenAndTipo(@Param("cia") String cia,@Param("cat") String cat,
			@Param("lin") String lin,@Param("sub") String sub, @Param("pre") String pre, @Param("alm") String alm);

	List<StockLibroDTO> findByCiaAndCatalogoAndLineaAndSubLineaAndFamAndAlmacenAndTipo(
			@Param("cia") String cia, @Param("cat") String cat, @Param("lin") String lin, @Param("sub") String sub,
			@Param("fam") String fam, @Param("pre") String pre, @Param("alm") String alm);
}
