package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arccpr;

public interface IArccprService {
 //VAMOS A LISTAR POR CIA Y DEPARTAMENTO	
 List<Arccpr> listarProvinciaXCiaAndDepart(String cia, String dp);

}
