package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.dto.DocumentoDto;
import com.cdsi.backend.inve.dto.DocumentoElectronicoNc;
import com.cdsi.backend.inve.dto.NotaCreditoRepoCab;
import com.cdsi.backend.inve.dto.NotaCreditoRepoDet;
import com.cdsi.backend.inve.models.dao.IArccmcDao;
import com.cdsi.backend.inve.models.dao.IArfafeRepo;
import com.cdsi.backend.inve.models.dao.IEstadoRepo;
import com.cdsi.backend.inve.models.entity.ArcctdaEntity;
import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.entity.ArfafePK;
import com.cdsi.backend.inve.models.entity.Arfafl;
import com.cdsi.backend.inve.models.entity.Arfafp;
import com.cdsi.backend.inve.models.entity.ArfafpPK;
import com.cdsi.backend.inve.models.entity.Articulo;
import com.cdsi.backend.inve.models.services.IArcctdaServe;
import com.cdsi.backend.inve.models.services.IArfafeService;
import com.cdsi.backend.inve.models.services.IArfafpService;
import com.cdsi.backend.inve.models.services.IArfamcService;
import com.cdsi.backend.inve.models.services.IArticuloService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class ArfafeServiceImple implements IArfafeService {

    @Autowired
    private IArfafeRepo iArfafeRepo;
    @Autowired
    private IEstadoRepo estadoRepo;
    @Autowired
    private IArccmcDao arccmcDao;
    @Autowired
    private IArfamcService arfamcServe;
    @Autowired
    private IArcctdaServe arcctdaServe;
    @Autowired
    private IArfafpService arfafpServi;
    @Autowired
    private IArticuloService articuloServi;
    

    @Override
    public List<DocumentoElectronicoNc> listaDocumentosElectronicosNc(String cia, String doc, String pven) {
        List<Arfafe> arfafes = this.iArfafeRepo.listaDocumentoElectronicos(cia, doc, pven);
        if (!arfafes.isEmpty()){
             List<DocumentoElectronicoNc> documentoElectronicoNcList = new ArrayList<DocumentoElectronicoNc>();
             for(Arfafe arfafe: arfafes){
                  DocumentoElectronicoNc documentoElectronicoNc = new DocumentoElectronicoNc();
                  documentoElectronicoNc.setTipoDoc(arfafe.getArfafePK().getTipoDoc());
                  documentoElectronicoNc.setNoFactu(arfafe.getArfafePK().getNoFactu());
                  documentoElectronicoNc.setFecha(arfafe.getFECHA());
                  documentoElectronicoNc.setTipoRefeFactu(arfafe.getTIPO_REFE_FACTU());
                  documentoElectronicoNc.setNoRefeFactu(arfafe.getNO_REFE_FACTU());
                  documentoElectronicoNc.setCodTped(arfafe.getCOD_T_PED());
                  documentoElectronicoNc.setEstado(this.estadoRepo.nombreEstado(doc,arfafe.getESTADO()));
                  documentoElectronicoNc.setNoCliente(arfafe.getNO_CLIENTE());
                  documentoElectronicoNc.setNombreCli(this.arccmcDao.nombreClient(cia,arfafe.getNO_CLIENTE()));
				  documentoElectronicoNc.setMoticoNc(arfafe.getMOTIVO_NC());
                  documentoElectronicoNc.setMoneda(arfafe .getMONEDA());
                  documentoElectronicoNc.setTotal(arfafe.getTOTAL());

                  documentoElectronicoNcList.add(documentoElectronicoNc);
             }
             return documentoElectronicoNcList;
        }
        return null;
    }

    @Override
	public Arfafe getExisteArinme1(String cia, String centro, String bodega, String tipDoc, String noDocu,
			String noCli) {
		// TODO Auto-generated method stub
		return this.iArfafeRepo.getExisteArinme1(cia, centro, bodega, tipDoc, noDocu, noCli);
	}
    
	@Override
	public List<DocumentoDto> listaByCiaAndTipDocAndEstado(String cia, String tipDoc, String estado) {
		List<Arfafe> arfafes = this.iArfafeRepo.listaByCiaTipDocEstado(cia, tipDoc, estado);
		if(!arfafes.isEmpty()) {
		   List<DocumentoDto> documentodtos = new ArrayList<>();
		   for(Arfafe arfafe: arfafes) {
			   DocumentoDto docuDto = new DocumentoDto(arfafe.getArfafePK().getTipoDoc(), arfafe.getArfafePK().getNoFactu(),
					      arfafe.getFECHA(), arfafe.getNO_CLIENTE(), arfafe.getNBR_CLIENTE());
			   documentodtos.add(docuDto);
		   }
		   return documentodtos;
		}
		return null;
	}

    @Override
    public Arfafe buscarId(String cia, String doc, String factu) throws ServiceException {
        try {
            Arfafe arfafe = this.iArfafeRepo.buscarId(cia,doc,factu);
            return arfafe;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Arfafe> buscarCiaAndIndPvent(int limit, int page, String cia, String indPvent) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(limit, page);
            Page<Arfafe> arfafePage = this.iArfafeRepo.buscarCiaAndIndPvent(pageableRequest, cia, indPvent);
            List<Arfafe> arfafeList = arfafePage.getContent();
            return arfafeList;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }
    
    @Override
    public List<Arfafe> listarFacturasPvta(String cia, String pven, String doc, String f1, String f2, String fac){
    	return this.iArfafeRepo.listArfafePventa(cia, pven, doc, f1, f2, fac);
    }

    @Override
    public List<Arfafe> buscarCiaAndIndPvenAndNoCliente(int limit, int page, String cia, String indPvent, String noCliente) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(page, limit);
            Page<Arfafe> arfafePage = this.iArfafeRepo.buscarCiaAndIndPventAndNoCliente(pageableRequest,cia,indPvent,noCliente);
            List<Arfafe> arfafeList = arfafePage.getContent();
            return arfafeList;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Arfafe> buscarCiaAndIndPventAndNoFactu(int limit, int page, String cia, String indPvent, String factu) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(page, limit);
            Page<Arfafe> arfafePage = this.iArfafeRepo.buscarCiaAndIndPventAndNoFactu(pageableRequest,cia,indPvent,factu);
            List<Arfafe> arfafeList = arfafePage.getContent();
            return arfafeList;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arfafe findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafe> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafe> findByLike(Arfafe arfafe) throws ServiceException {
        return null;
    }

    @Override
    public Arfafe save(Arfafe arfafe) throws ServiceException {
        try{
            Arfafe arfafe1 = this.iArfafeRepo.save(arfafe);
            return arfafe1;
        }catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arfafe delete(Long id) throws ServiceException {
        return null;
    }

    @Override
    public Page<Arfafe> pageCia(int limit, int page, String cia) throws ServiceException {
        Pageable pageableRest = PageRequest.of(page,limit);
        Page<Arfafe> arfafePage = this.iArfafeRepo.pageCia(pageableRest,cia);
        return arfafePage;
    }

	@Override
	public byte[] generarReporteNotaCredito(String cia, String sucursal,String tipoDoc, String noFactu) {
		ArfafePK arfafePk = new ArfafePK(cia, tipoDoc, noFactu);
		Arfafe arfafe = this.iArfafeRepo.findById(arfafePk).orElse(null);
		if(arfafe != null) {
			byte[] data = null;
			ArcctdaEntity arcctda = this.arcctdaServe.getArcctda(cia, "001", noFactu);
			ArfafpPK arfafpPk = new ArfafpPK(cia,arfafe.getTIPO_FPAGO(),arfafe.getCOD_FPAGO());
			Arfafp arfafp = this.arfafpServi.buscarId(arfafpPk);
			NotaCreditoRepoCab notaCredRepoCab = this.arfamcServe.getNotaCreditoRepoCar(cia, sucursal);
			notaCredRepoCab.setP_NOCLI(arfafe.getNO_CLIENTE());
			notaCredRepoCab.setP_NOCLI(arfafe.getNBR_CLIENTE());
			notaCredRepoCab.setP_MONEDA(arfafe.getMONEDA());
			notaCredRepoCab.setP_DOC_REFE(arfafe.getNO_REFE_FACTU());
			notaCredRepoCab.setP_FEC_EMI(arfafe.getFECHA());
			notaCredRepoCab.setP_DIRECC(arcctda.getDireccion());
			notaCredRepoCab.setP_PAGO(arfafp.getDescripcion());
			
			Map<String, Object> parametros = new HashMap<String, Object>();
			parametros.put("PRUC_CIA", notaCredRepoCab.getPRUC_CIA());
			parametros.put("PNOFACTU_CIA", notaCredRepoCab.getPRUC_CIA());
			parametros.put("PNOMBRE_CIA", notaCredRepoCab.getPNOMBRE_CIA() );
			parametros.put("PDIRECCION_CIA", notaCredRepoCab.getPDIRECCION_CIA() );
			parametros.put("PTELE_CIA", notaCredRepoCab.getPTELE_CIA() );
			parametros.put("PEMAIL_CIA", notaCredRepoCab.getPEMAIL_CIA());
			parametros.put("PWEB_CIA", notaCredRepoCab.getPWEB_CIA());
			parametros.put("PSUCUR_CIA", notaCredRepoCab.getPSUCUR_CIA());
			parametros.put("P_NOCLI", notaCredRepoCab.getP_NOCLI());
			parametros.put("P_NOMBRE", notaCredRepoCab.getP_NOMBRE() );
			parametros.put("P_DIRECC", notaCredRepoCab.getP_DIRECC());
			parametros.put("P_FEC_EMI", notaCredRepoCab.getP_FEC_EMI());
			parametros.put("P_PAGO", notaCredRepoCab.getP_PAGO());
			parametros.put("P_MONEDA", notaCredRepoCab.getP_MONEDA());
			parametros.put("P_DOC_REFE", notaCredRepoCab.getP_DOC_REFE());
			
			try {
				File file = new ClassPathResource("/reports/NotaCredito.jasper").getFile();
				JasperPrint prin = JasperFillManager.fillReport(file.getPath(), parametros, new JRBeanCollectionDataSource( this.listaNotaCredRepoDet(arfafe) ) );
				data = JasperExportManager.exportReportToPdf(prin);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<NotaCreditoRepoDet> listaNotaCredRepoDet(Arfafe arfafe) {
		List<NotaCreditoRepoDet> notaCredRepDets = new ArrayList<NotaCreditoRepoDet>();
		for(Arfafl arfafl: arfafe.getArfaflList()) {
			Articulo articulo = this.articuloServi.findByCiaAndCod(arfafl.getArfaflPK().getNoCia(), arfafl.getNO_ARTI());
			NotaCreditoRepoDet notaCredRepDet = new NotaCreditoRepoDet();
			notaCredRepDet.setCONSECUTIVO( arfafl.getCONCEPTO() );
			notaCredRepDet.setNO_ARTI(arfafl.getNO_ARTI());
			notaCredRepDet.setUM(articulo.getMedida());
			notaCredRepDet.setNOMBRE(articulo.getDescripcion());
			notaCredRepDet.setCANTIDAD_FACT(arfafl.getCANTIDAD_FACT());
			notaCredRepDet.setPRECIO_UNIT(arfafl.getPRECIO_UNIT());
			notaCredRepDet.setIMP_IGV(arfafl.getIMP_IGV());
			notaCredRepDet.setTOTAL(arfafl.getTOTAL());
			
			notaCredRepDets.add(notaCredRepDet);
		}
	    return notaCredRepDets;
	}

}
