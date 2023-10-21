package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Tapfopa;

public interface ITapfopaService {
  List<Tapfopa> listaCiaAndEstado(String cia, String estado);
}
