package com.timal.app.prueba.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timal.app.prueba.models.Marca;
import com.timal.app.prueba.models.Submarca;

public interface ISubmarcasDao extends JpaRepository<Submarca, Long> {
	List<Submarca> findByMarca(Marca marca);
}
