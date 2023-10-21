package com.cdsi.backend.inve.models.services;


import java.util.List;

import org.springframework.data.domain.Page;

import com.cdsi.backend.inve.models.entity.VArinda1PS;


public interface IVArinda1PSService {
	
	//METODO QUE NOS PERMOTE LISTAR POR CIA, LISTA DE PRECIO
	List<VArinda1PS> listaItemCiaAndListaPrecio(String cia,String lp);
	
	//METODO QUE NOS PERMOTE LISTAR POR CIA, LISTA DE PRECIO Y DESCRIPCION DEL ITEM
	List<VArinda1PS> listaItemCiaAndListaPrecioAndDescripcion(String cia,String lp,String desc);
	
	//METODO QUE NOS PERMITE PAGINAR POR CIA Y LISTA DE PRECIO
	Page<VArinda1PS> pagListaItemCiaAndListaPrecio(int limit, int page, String cia,String lp);
	
}
