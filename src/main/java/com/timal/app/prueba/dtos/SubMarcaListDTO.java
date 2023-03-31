package com.timal.app.prueba.dtos;

import java.util.ArrayList;
import java.util.List;

public class SubMarcaListDTO {
	private Long id;
	private String nombre;
	private MarcaDTO marca;

	private List<ModeloDTO> modelos;
	

	public List<ModeloDTO> getModelos() {
		return modelos;
	}

	public void setModelos(List<ModeloDTO> modelos) {
		this.modelos = modelos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MarcaDTO getMarca() {
		return marca;
	}

	public void setMarca(MarcaDTO marca) {
		this.marca = marca;
	}

	public SubMarcaListDTO() {
		modelos = new ArrayList();
	}
	
	public void agregarModelo(ModeloDTO m) {
		// TODO Auto-generated method stub
		this.modelos.add(m);
	}	
	
	
	
	
	
}
