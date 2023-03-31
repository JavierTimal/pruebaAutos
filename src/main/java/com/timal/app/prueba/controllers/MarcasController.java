package com.timal.app.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timal.app.prueba.dtos.MarcaListDTO;
import com.timal.app.prueba.models.Marca;
import com.timal.app.prueba.services.IService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MarcasController {

	@Autowired
	private IService<MarcaListDTO, MarcaListDTO> marcasService;
	
	@GetMapping("/marcas")
	public List<MarcaListDTO> getAll(){
		return marcasService.getAll();
	}
}
