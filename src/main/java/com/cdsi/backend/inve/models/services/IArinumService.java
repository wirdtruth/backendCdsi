package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arinum;

public interface IArinumService {
   List<Arinum> listarXciaAndEstado(String cia, String estado);
}
