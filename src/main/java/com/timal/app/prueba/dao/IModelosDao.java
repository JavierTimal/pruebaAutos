package com.timal.app.prueba.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timal.app.prueba.models.Modelo;
import com.timal.app.prueba.models.Submarca;

public interface IModelosDao extends JpaRepository<Modelo, Long> {
	List<Modelo> findBySubmarca(Submarca submarca);
	
}
