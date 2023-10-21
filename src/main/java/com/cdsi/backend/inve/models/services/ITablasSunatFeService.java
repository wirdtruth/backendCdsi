package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.TablasSunatFe;

public interface ITablasSunatFeService {
	
	List<TablasSunatFe> listar(String clase);

}
