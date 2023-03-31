package com.timal.app.prueba.dtos;

import java.util.ArrayList;
import java.util.List;

public class MarcaListDTO {
	private Long id;
	private String nombre;
	List<SubmarcaDTO> submarcas;
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
	public List<SubmarcaDTO> getSubmarcas() {
		return submarcas;
	}
	public void setSubmarcas(List<SubmarcaDTO> submarcas) {
		this.submarcas = submarcas;
	}
	public MarcaListDTO() {
		this.submarcas = new ArrayList();
	}
	
	public void agregarSubmarca(SubmarcaDTO s) {
		this.submarcas.add(s);
	}
	
	
	
	
}
