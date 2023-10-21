package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.ArpfoePK;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArpfoeRepo extends PagingAndSortingRepository<Arpfoe, ArpfoePK> {
	
	@Query("FROM Arpfoe a where a.arpfoePK.noCia = :cia AND a.indPvent = :indPvent "
			+ "AND a.fRecepcion BETWEEN TO_DATE(:f1,'DD/MM/YYYY') and TO_DATE(:f2,'DD/MM/YYYY HH24:MI')"
			+ " ORDER BY a.fRecepcion DESC" )
    List<Arpfoe> listarCiaAndIndPvent(@Param("cia") String cia , @Param("indPvent") String indPvent,
    		@Param("f1") String f1, @Param("f2") String f2);

    //METODO QUE NOS PERMITE OPTENER UN PEDIDO
    @Query("SELECT a FROM Arpfoe a where a.arpfoePK.noCia = :cia AND a.arpfoePK.noOrden = :noOrden")
    public Arpfoe buscarId(@Param("cia") String cia, @Param("noOrden") String noOrden);

    @Query("SELECT a FROM Arpfoe a where a.arpfoePK.noCia = :cia")
    Page<Arpfoe> pageCia(Pageable pageable, @Param("cia") String cia);

    //METODO QUE NOS PERMITE TRAER TODO LOS PEDIDOS
    @Query("SELECT a FROM Arpfoe a where a.arpfoePK.noCia = :cia AND a.indPvent = :indPvent")
    Page<Arpfoe> buscarCiaAndIndPvent(Pageable pageable, @Param("cia") String cia , @Param("indPvent") String indPvent);

    //METODO QUE NOS PERMITE OBTENER PEDIDOS POR UN CLIENTE
    @Query("SELECT a FROM Arpfoe a WHERE a.arpfoePK.noCia = :cia and a.indPvent = :indPvent and a.noCliente = :noCliente")
    Page<Arpfoe> buscarCiaAndIndPventAndNoCliente(Pageable pageable,@Param("cia") String cia, @Param("indPvent") String indPvent,
                                                  @Param("noCliente") String noCliente);

    //METODO QUE NOS PERMITE OBTENER LOS PEDIDOS POR TRANSACCION
    @Query("SELECT a FROM Arpfoe a WHERE a.arpfoePK.noCia = :cia and a.indPvent = :indPvent and a.codTPed = :codTPed")
    Page<Arpfoe> buscarCiaAndIndPventAndCodTPed(Pageable pageable, @Param("cia") String cia, @Param("indPvent") String indPvent,
                                                @Param("codTPed") String codTPed);

}
