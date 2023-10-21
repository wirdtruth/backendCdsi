package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.dao.exception.ExceptionRepository;
import com.cdsi.backend.inve.models.entity.Transaccion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITransaccionRepo  {

    //VAMOS A TRAER LAS TRANSACCIONES DEL USUARIO Y EMPRESA
    List<Transaccion> findByCiaAndUser(String cia , String usuario) throws ExceptionRepository;

}
