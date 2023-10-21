package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arpffe;
import com.cdsi.backend.inve.models.entity.ArpffePK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArpffeRepo extends PagingAndSortingRepository<Arpffe, ArpffePK> {

    @Query("SELECT a FROM Arpffe a WHERE a.arpffePK.noCia = :cia AND a.arpffePK.bodega = :bodega AND a.arpffePK.noGuia = :guia")
    Arpffe buscarId(@Param("cia") String cia, @Param("bodega") String bodega,@Param("guia") String guia);

    @Query("SELECT a FROM Arpffe a WHERE a.arpffePK.noCia = :cia")
    Page<Arpffe> pagiCia(Pageable pageable, @Param("cia") String cia);

}
