package com.timal.app.prueba.dtos;

import java.util.ArrayList;
import java.util.List;

public class ModeloListDTO {

	private Long id;
	private String modelo;
	private SubmarcaDTO submarca;
	private List<DescripcionDTO> descripciones;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public SubmarcaDTO getSubmarca() {
		return submarca;
	}
	public void setSubmarca(SubmarcaDTO submarca) {
		this.submarca = submarca;
	}
	public List<DescripcionDTO> getDescripciones() {
		return descripciones;
	}
	public void setDescripciones(List<DescripcionDTO> descripciones) {
		this.descripciones = descripciones;
	}
	public ModeloListDTO() {
		this.descripciones = new ArrayList();
	}
	
	public void agregarDescripcion(DescripcionDTO d) {
		this.descripciones.add(d);
	}
	
	
	
	
}
