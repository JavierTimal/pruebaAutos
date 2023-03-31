package com.timal.app.prueba.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timal.app.prueba.dao.IMarcasDao;
import com.timal.app.prueba.dao.ISubmarcasDao;
import com.timal.app.prueba.dtos.MarcaDTO;
import com.timal.app.prueba.dtos.ModeloDTO;
import com.timal.app.prueba.dtos.SubMarcaListDTO;
import com.timal.app.prueba.models.Modelo;
import com.timal.app.prueba.models.Submarca;

@Component
public class SubmarcasService implements ISubmarcasService{

	@Autowired
	ISubmarcasDao submarcasDao;
	
	@Autowired
	IMarcasDao marcasDao;
	
	@Override
	public SubMarcaListDTO create(SubMarcaListDTO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubMarcaListDTO> getAll() {
		// TODO Auto-generated method stub
		List<SubMarcaListDTO> submarcasDTO = new ArrayList();
		List<Submarca> submarcas = submarcasDao.findAll();
		for (Submarca submarca : submarcas) {
			submarcasDTO.add(this.entityToDto(submarca));
		}
		return submarcasDTO;
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
	
	public SubMarcaListDTO entityToDto(Submarca s) {
		SubMarcaListDTO submarcaDTO = new SubMarcaListDTO();
		submarcaDTO.setId(s.getId());
		submarcaDTO.setNombre(s.getNombre());
		MarcaDTO m = new MarcaDTO();
		m.setId(s.getMarca().getId());
		m.setNombre(s.getMarca().getNombre());
		submarcaDTO.setMarca(m);
		for (Modelo modelo : s.getModelos()) {
			ModeloDTO modeloDTO = new ModeloDTO();
			modeloDTO.setId(modelo.getId());
			modeloDTO.setModelo(modelo.getModelo());
			submarcaDTO.agregarModelo(modeloDTO);
		}
		return submarcaDTO;
	}
	
	public List<SubMarcaListDTO> getSubMarcasByMarca(Long idMarca){
		List<SubMarcaListDTO> lista = new ArrayList();
		List<Submarca> submarcas = this.submarcasDao.findByMarca(marcasDao.findById(idMarca).orElseThrow(() -> new RuntimeException()));
		for (Submarca submarca : submarcas) {
			lista.add(this.entityToDto(submarca));
		}
		return lista;
	}

}
