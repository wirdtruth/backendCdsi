package com.cdsi.backend.inve.models.dao.imple;

import com.cdsi.backend.inve.models.dao.ITransaccionRepo;
import com.cdsi.backend.inve.models.dao.exception.ExceptionRepository;
import com.cdsi.backend.inve.models.entity.Transaccion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@Slf4j
@Repository
@Transactional
public class TransaccionRepoImple implements ITransaccionRepo {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Transaccion> findByCiaAndUser(String cia, String usuario) throws ExceptionRepository {
        try {
            StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("transaccion.listar");
            spq.setParameter("P_CIA",cia);
            spq.setParameter("P_USER",usuario);

            if (spq.execute()){
                List<Transaccion> transaccionList = (List<Transaccion>) spq.getResultList();
                return transaccionList;
            }

        }catch (Exception e){
        	log.error(e.getMessage());
            throw new ExceptionRepository(e);
        }
        return null;
    }
}
