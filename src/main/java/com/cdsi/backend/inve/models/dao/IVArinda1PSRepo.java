package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import com.cdsi.backend.inve.models.entity.VArinda1PS;

@Repository
public interface IVArinda1PSRepo extends PagingAndSortingRepository<VArinda1PS, String> {
	
	//METODO QUE NOS PERMITE BUSCAR POR CIA Y LISTA DE PRECIO
	@Query("SELECT v FROM VArinda1PS v WHERE v.noCia = :cia AND v.tipo = :lp")
	public List<VArinda1PS> listaItemsXCiaAndLisPrecio(@Param("cia") String cia,@Param("lp") String lp);
	
	//METODO QUE NOS PERMITE BUSCAR UN ITEM POR SU DESCRIPCION
	@Query("SELECT v FROM VArinda1PS v WHERE v.noCia = :cia AND v.tipo = :lp AND v.descripcion LIKE %:desc%")
	public List<VArinda1PS> listaItemsXCiaAndListPrecAndDescrip(@Param("cia") String cia,@Param("lp") String lp, @Param("desc") String desc);
	
	//METODO QUE NOS VA PERMITIR MOSTRAR TODOS LOS ITEMS POR CIA Y LISTA DE PRECIO POR PAGINACION
	@Query("SELECT v FROM VArinda1PS v WHERE v.noCia = :cia AND v.tipo = :lp")
	public Page<VArinda1PS> pagListaItemXCiaAndListaPrecio(Pageable pageable,@Param("cia") String cia, @Param("lp") String lp);
	

}
