package com.timal.app.prueba.services;

import java.util.List;

import com.timal.app.prueba.dtos.DescripcionListDTO;

public interface IDescripcionesService extends IService<DescripcionListDTO, DescripcionListDTO>{
	List<DescripcionListDTO> getDescripcionesByModelo(Long idModelo);
}
