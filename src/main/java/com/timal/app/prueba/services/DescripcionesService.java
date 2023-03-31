package com.timal.app.prueba.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timal.app.prueba.dao.IDescripcionesDao;
import com.timal.app.prueba.dao.IModelosDao;
import com.timal.app.prueba.dao.ISubmarcasDao;
import com.timal.app.prueba.dtos.DescripcionListDTO;
import com.timal.app.prueba.models.Descripcion;
import com.timal.app.prueba.models.Modelo;
import com.timal.app.prueba.models.Submarca;

@Component
public class DescripcionesService implements IDescripcionesService {

	@Autowired
	IModelosDao modelosDao;
	
	@Autowired
	IDescripcionesDao descripcionesDao;
	
	@Autowired
	ISubmarcasDao submarcasDao;
	
	@Override
	public DescripcionListDTO create(DescripcionListDTO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DescripcionListDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DescripcionListDTO getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DescripcionListDTO update(DescripcionListDTO obj, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DescripcionListDTO> getDescripcionesByModelo(Long idModelo) {
		// TODO Auto-generated method stub
		//Submarca s = this.submarcasDao.findById(idSubmarca).orElseThrow(() -> new RuntimeException());
		List<Descripcion> descripciones = this.descripcionesDao.findByModelo(this.modelosDao.findById(idModelo).orElseThrow(() -> new RuntimeException()));
		List<DescripcionListDTO> descripcionesDTO = new ArrayList<>();
		
		for (Descripcion d : descripciones) {
			descripcionesDTO.add(this.entityToDto(d));
		}
		
		
		return descripcionesDTO;
	}
	
	public DescripcionListDTO entityToDto(Descripcion d) {
		DescripcionListDTO ddto = new DescripcionListDTO();
		ddto.setId(d.getId());
		ddto.setDescripcion(d.getDescripcion());
		ddto.setDescripcionLlave(d.getDescripcionLlave());
		ddto.setIdMarca(d.getModelo().getSubmarca().getMarca().getId());
		ddto.setMarca(d.getModelo().getSubmarca().getMarca().getNombre());
		ddto.setIdSubmarca(d.getModelo().getSubmarca().getId());
		ddto.setSubmarca(d.getModelo().getSubmarca().getNombre());
		ddto.setIdModelo(d.getModelo().getId());
		ddto.setModelo(d.getModelo().getModelo());
		
		return ddto;
	}

}
