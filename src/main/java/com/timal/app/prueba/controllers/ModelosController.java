package com.timal.app.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timal.app.prueba.dtos.ModeloListDTO;
import com.timal.app.prueba.services.IModelosService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ModelosController {

	@Autowired
	private IModelosService modelosService;
	
	@GetMapping("/modelos/{submarca}")
	public List<ModeloListDTO> getModelosBySubmarca(@PathVariable(name = "submarca") Long idSubmarca ){
		return this.modelosService.getModelosBySubmarca(idSubmarca);
	}
	
}
