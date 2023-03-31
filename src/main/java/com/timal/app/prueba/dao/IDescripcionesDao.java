package com.timal.app.prueba.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timal.app.prueba.models.Descripcion;
import com.timal.app.prueba.models.Modelo;

public interface IDescripcionesDao extends JpaRepository<Descripcion, Long> {
	
	List<Descripcion> findByModelo(Modelo modelo);
	//List<Descripcion> findByModelos(List<Modelo> modelos);
}
