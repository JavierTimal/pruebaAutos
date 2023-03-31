package com.timal.app.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timal.app.prueba.dtos.SubMarcaListDTO;
import com.timal.app.prueba.services.IService;
import com.timal.app.prueba.services.ISubmarcasService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SubMarcasController {
	
	@Autowired
	private ISubmarcasService submarcasService;
	
	@GetMapping("/submarcas")
	public List<SubMarcaListDTO> getAll(){
		return this.submarcasService.getAll();
	}
	
	@GetMapping("/submarcas/{marca}")
	public List<SubMarcaListDTO> getSubMarcasByMarca(@PathVariable(name = "marca") Long idMarca){
		
		return this.submarcasService.getSubMarcasByMarca(idMarca);
	}

}
