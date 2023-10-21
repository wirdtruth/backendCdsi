package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arfacf;
import com.cdsi.backend.inve.models.entity.ArfacfPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArfacfRepo extends PagingAndSortingRepository<Arfacf, ArfacfPK> {

    @Query("SELECT a from Arfacf a WHERE a.arfacfPK.noCia = :cia AND a.arfacfPK.centro = :centro")
    public Arfacf buscarId(@Param("cia") String cia, @Param("centro") String centro);

    @Query("SELECT a FROM Arfacf a WHERE a.arfacfPK.noCia = :cia")
    public Page<Arfacf> pageCia(@Param("cia") String cia, Pageable pageable);
}
