package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Transaccion;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface ITransaccionService extends IGenericService<Transaccion> {

    //METODO QUE NOS PERMITE TRAER TODAS LAS TRANSACCIONES DE UN USUARIO POR SU COMPAÑIA
    List<Transaccion> findByCiaAndUser(String cia, String usurio);
}
