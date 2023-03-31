package com.timal.app.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "descripciones")
@Entity
public class Descripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ4")
	@SequenceGenerator(sequenceName = "customer_seq4", allocationSize = 1, name = "CUST_SEQ4")
	private Long id;

	@Column
	private String descripcionLlave;
	
	@Column
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "modelo")
	private Modelo modelo;

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

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	
	
}
