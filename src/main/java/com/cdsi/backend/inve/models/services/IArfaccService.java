package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.dto.SerieDocumentoDto;
import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.ArfaccPK;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IArfaccService extends IGenericService<Arfacc> {
	
	List<SerieDocumentoDto> listaSerieDocumento(String cia, String tipoDoc, String centro,  String activo) throws ServiceException;

    Arfacc actualizar(ArfaccPK arfaccPK, Arfacc arfacc) throws ServiceException;

    List<Arfacc> buscarCiaAndTipDocAndCentroAndActivo(Arfacc arfacc) throws ServiceException;

    Page<Arfacc> listPageCia(int limit, int page,ArfaccPK arfaccPK) throws ServiceException;

    Page<Arfacc> listPageCiaAndActivo(int limit, int page,Arfacc arfacc) throws ServiceException;

    Page<Arfacc> listPageCiaAndTipoDoc(int limit, int page,Arfacc arfacc) throws ServiceException;

    Page<Arfacc> listPageCiaAndCentro(int limit, int page,Arfacc arfacc) throws ServiceException;

}
