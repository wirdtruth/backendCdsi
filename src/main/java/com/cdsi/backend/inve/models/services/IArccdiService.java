package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arccdi;

public interface IArccdiService {
  //LISTAR DISTRITOS POR CIA,PROVINCIA Y PROVINCIA
	List<Arccdi> listarDistritoXCiaAndDepartaAndProvin(String cia, String dp, String pr);
}
