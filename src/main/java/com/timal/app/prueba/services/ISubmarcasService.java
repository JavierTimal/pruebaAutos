package com.timal.app.prueba.services;

import java.util.List;

import com.timal.app.prueba.dtos.SubMarcaListDTO;

public interface ISubmarcasService extends IService<SubMarcaListDTO, SubMarcaListDTO> {
	List<SubMarcaListDTO> getSubMarcasByMarca(Long idMarca);

}
