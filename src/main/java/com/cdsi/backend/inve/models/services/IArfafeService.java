package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.dto.DocumentoDto;
import com.cdsi.backend.inve.dto.DocumentoElectronicoNc;
import com.cdsi.backend.inve.dto.NotaCreditoRepoDet;
import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface IArfafeService extends IGenericService<Arfafe> {
	
	public List<NotaCreditoRepoDet> listaNotaCredRepoDet(Arfafe arfafe);
    
	public byte[] generarReporteNotaCredito(String cia, String sucursal,String tipo, String noFactu);
    
	public List<DocumentoElectronicoNc> listaDocumentosElectronicosNc(String cia, String doc, String pven);

	public Arfafe getExisteArinme1(String cia, String centro, String bodega, String tipDoc, String noDocu, String noCli);
	
	public List<DocumentoDto> listaByCiaAndTipDocAndEstado(String cia,String tipDoc,String estado);

    public Arfafe buscarId(String cia, String doc, String factu) throws ServiceException;
    
    public List<Arfafe> listarFacturasPvta(String cia, String pven, String doc, String f1, String f2, String fac);

    public List<Arfafe> buscarCiaAndIndPvent(int limit, int page, String cia, String indPvent)throws ServiceException;

    List<Arfafe> buscarCiaAndIndPvenAndNoCliente(int limit, int page, String cia, String indPvent, String noCliente) throws ServiceException;

    List<Arfafe> buscarCiaAndIndPventAndNoFactu(int limit, int page, String cia, String indPvent, String factu) throws ServiceException;
    
}
