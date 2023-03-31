package com.timal.app.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timal.app.prueba.dtos.DescripcionListDTO;
import com.timal.app.prueba.services.IDescripcionesService;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "*")
public class DescripcionesController {
	
	@Autowired
	IDescripcionesService descripcionesService;

	@GetMapping("/descripciones/{modelo}")
	public List<DescripcionListDTO> getDescripciones(@PathVariable(name = "modelo") Long idModelo){
		return this.descripcionesService.getDescripcionesByModelo(idModelo);
	}
}
