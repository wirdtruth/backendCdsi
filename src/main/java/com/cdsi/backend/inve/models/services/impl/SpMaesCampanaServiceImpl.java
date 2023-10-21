package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IspMaesCampanaRepo;
import com.cdsi.backend.inve.models.entity.SpMaesCampana;
import com.cdsi.backend.inve.models.entity.SpMaesCampanaPK;
import com.cdsi.backend.inve.models.services.IspMaesCampService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpMaesCampanaServiceImpl implements IspMaesCampService {

    @Autowired
    private IspMaesCampanaRepo ispMaesCampanaRepo;

    @Override
    public List<SpMaesCampana> listaCampanaActivas(String cia, String estado) throws ServiceException {
        List<SpMaesCampana> listSpMaesCampana = this.ispMaesCampanaRepo.listaCampanaActivas(cia,estado);
        return listSpMaesCampana;
    }

    @Override
    public SpMaesCampana findByCiaAndCamp(SpMaesCampanaPK spMaesCampanaPK) {
        SpMaesCampana spMaesCampana = this.ispMaesCampanaRepo.findByCiaAndCamp(spMaesCampanaPK.getNroCia(), spMaesCampanaPK.getCodiCamp());
        return spMaesCampana;
    }

    @Override
    public SpMaesCampana findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<SpMaesCampana> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<SpMaesCampana> findByLike(SpMaesCampana spMaesCampana) throws ServiceException {
        return null;
    }

    @Override
    public SpMaesCampana save(SpMaesCampana spMaesCampana) throws ServiceException {
        return null;
    }

    @Override
    public SpMaesCampana delete(Long id) throws ServiceException {
        return null;
    }

	@Override
	public Page<SpMaesCampana> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
}

