package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arfatdir;
import com.cdsi.backend.inve.models.entity.ArfatdirPK;

@Repository
public interface IArfatdirRepo extends JpaRepository<Arfatdir, ArfatdirPK> {

}
