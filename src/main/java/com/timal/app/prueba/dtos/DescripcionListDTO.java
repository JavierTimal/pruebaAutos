package com.timal.app.prueba.dtos;

public class DescripcionListDTO {
	private Long id;
	private String descripcionLlave;
	private String descripcion;
	private Long idMarca;
	private String marca;
	private Long idSubmarca;
	private String submarca;
	private Long idModelo;
	private String modelo;
	
	
	public Long getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}
	public Long getIdSubmarca() {
		return idSubmarca;
	}
	public void setIdSubmarca(Long idSubmarca) {
		this.idSubmarca = idSubmarca;
	}
	public Long getIdModelo() {
		return idModelo;
	}
	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcionLlave() {
		return descripcionLlave;
	}
	public void setDescripcionLlave(String descripcionLlave) {
		this.descripcionLlave = descripcionLlave;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSubmarca() {
		return submarca;
	}
	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
