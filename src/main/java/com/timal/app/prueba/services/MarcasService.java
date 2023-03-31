package com.timal.app.prueba.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timal.app.prueba.dao.IMarcasDao;
import com.timal.app.prueba.dtos.MarcaListDTO;
import com.timal.app.prueba.dtos.SubmarcaDTO;
import com.timal.app.prueba.models.Marca;
import com.timal.app.prueba.models.Submarca;

@Component
public class MarcasService implements IService<MarcaListDTO, MarcaListDTO> {
	
	@Autowired
	private IMarcasDao marcasDao;

	@Override
	public MarcaListDTO create(MarcaListDTO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaListDTO> getAll() {
		// TODO Auto-generated method stub
		List<MarcaListDTO> marcasDTO = new ArrayList();
		List<Marca> marcas = marcasDao.findAll();
		for (Marca marca : marcas) {
			marcasDTO.add(this.entityToDto(marca));
		}
		return marcasDTO;
	}

	@Override
	public MarcaListDTO getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MarcaListDTO update(MarcaListDTO obj, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
	public MarcaListDTO entityToDto(Marca marca) {
		MarcaListDTO marcaDTO = new MarcaListDTO();
		marcaDTO.setId(marca.getId());
		marcaDTO.setNombre(marca.getNombre());
		for (Submarca s : marca.getSubmarcas()) {
			SubmarcaDTO submarcarDTO = new SubmarcaDTO();
			submarcarDTO.setId(s.getId());
			submarcarDTO.setNombre(s.getNombre());
			marcaDTO.agregarSubmarca(submarcarDTO);
		}
		return marcaDTO;
	}

}
