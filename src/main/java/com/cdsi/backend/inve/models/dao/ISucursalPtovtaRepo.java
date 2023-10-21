package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.SucursalPtovta;
import com.cdsi.backend.inve.models.entity.SucursalPtovtaPK;

@Repository
public interface ISucursalPtovtaRepo extends JpaRepository<SucursalPtovta, SucursalPtovtaPK> {

}
