package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arccdp;

public interface IArccdpService {
   //METODO QUE NOS PERMITE LISTAR LOS DEPARTAMENTO POR CIA
	List<Arccdp> listarDepartamentoXCia(String cia);
}
