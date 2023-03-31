package com.timal.app.prueba.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timal.app.prueba.dao.IModelosDao;
import com.timal.app.prueba.dao.ISubmarcasDao;
import com.timal.app.prueba.dtos.DescripcionDTO;
import com.timal.app.prueba.dtos.ModeloListDTO;
import com.timal.app.prueba.dtos.SubMarcaListDTO;
import com.timal.app.prueba.dtos.SubmarcaDTO;
import com.timal.app.prueba.models.Descripcion;
import com.timal.app.prueba.models.Modelo;

@Component
public class ModelosService implements IModelosService {

	@Autowired
	ISubmarcasDao submarcasDao;
	
	@Autowired
	IModelosDao modelosDao;
	
	@Override
	public SubMarcaListDTO create(SubMarcaListDTO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubMarcaListDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubMarcaListDTO getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubMarcaListDTO update(SubMarcaListDTO obj, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ModeloListDTO> getModelosBySubmarca(Long idSubmarca) {
		// TODO Auto-generated method stub
		List<Modelo> modelos = this.modelosDao.findBySubmarca(submarcasDao.findById(idSubmarca).orElseThrow(() -> new RuntimeException()));
		List<ModeloListDTO> modelosDto = new ArrayList();
		for (Modelo m : modelos) {
			modelosDto.add(this.entityToDto(m));
		}
		return modelosDto;
	}
	
	public ModeloListDTO entityToDto(Modelo m) {
		ModeloListDTO mDto = new ModeloListDTO();
		mDto.setId(m.getId());
		mDto.setModelo(m.getModelo());
		SubmarcaDTO s = new SubmarcaDTO();
		s.setId(m.getSubmarca().getId());
		s.setNombre(m.getSubmarca().getNombre());
		mDto.setSubmarca(s);
		for (Descripcion d : m.getDescripciones()) {
			DescripcionDTO ddto = new DescripcionDTO();
			ddto.setId(d.getId());
			ddto.setDescripcion(d.getDescripcion());
			ddto.setDescripcionLlave(d.getDescripcionLlave());
			mDto.agregarDescripcion(ddto);
		}
		return mDto;
	}

}
