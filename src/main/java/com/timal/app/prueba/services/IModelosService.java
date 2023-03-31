package com.timal.app.prueba.services;

import java.util.List;

import com.timal.app.prueba.dtos.ModeloListDTO;
import com.timal.app.prueba.dtos.SubMarcaListDTO;


public interface IModelosService extends IService<SubMarcaListDTO, SubMarcaListDTO>{

	List<ModeloListDTO> getModelosBySubmarca(Long idSubmarca);
}
