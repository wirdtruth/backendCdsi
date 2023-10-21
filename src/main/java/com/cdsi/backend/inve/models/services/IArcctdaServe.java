package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.ArcctdaEntity;

public interface IArcctdaServe {
	
  public ArcctdaEntity getArcctda(String cia, String sucursal, String noCliente);

}
