package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arcgcc;

@Repository
public interface IArcgccRepo extends JpaRepository<Arcgcc,String> {
	
	//VAMOS A TRAER TODO LOS DATOS
	@Query("SELECT a FROM Arcgcc a")
	List<Arcgcc> mostrarTodos();

}
