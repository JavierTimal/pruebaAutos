package com.timal.app.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.timal.app.prueba.models.Marca;

public interface IMarcasDao extends JpaRepository<Marca, Long>{
	
	

}
