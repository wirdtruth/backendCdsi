package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Usuac;

public interface IUsuacService {
  public Usuac buscarId(String cia, String usuario);
  public List<Usuac> buscarCiaAndActivo(String cia, String activo);
  public Usuac guardar(Usuac usu);
  public Usuac actualizar(Usuac usu);
  public void eliminar(String cia, String usuario);
}
