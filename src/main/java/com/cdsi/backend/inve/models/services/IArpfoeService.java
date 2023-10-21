package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface IArpfoeService extends IGenericService<Arpfoe> {
	
	public List<Arpfoe> listarPedidosPV(String cia, String indPvent, String fec1, String fec2) throws ServiceException;

    public Arpfoe buscarId(String cia, String noOrden) throws ServiceException;

    List<Arpfoe> buscarCiaAndIndPvent(int limit, int page,String cia, String indPvent) throws ServiceException;

    List<Arpfoe> buscarCiaAndIndPventAndNoCliente(int limit, int page,String cia, String indPvent, String noCliene) throws ServiceException;

    List<Arpfoe> buscarCiaAndIndPventAndCodTPed(int limit, int page,String cia, String indPvent, String codTPed) throws ServiceException;

}
