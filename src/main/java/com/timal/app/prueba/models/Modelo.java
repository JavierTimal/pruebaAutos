package com.timal.app.prueba.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "modelos")
@Entity
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ2")
	@SequenceGenerator(sequenceName = "customer_seq2", allocationSize = 1, name = "CUST_SEQ2")
	private Long id;
	
	@Column
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name = "submarca")
	private Submarca submarca;
	
	@OneToMany(mappedBy = "modelo")
	private Set<Descripcion> descripciones;
	
	

	public Set<Descripcion> getDescripciones() {
		return descripciones;
	}

	public void setDescripciones(Set<Descripcion> descripciones) {
		this.descripciones = descripciones;
	}

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

	public Submarca getSubmarca() {
		return submarca;
	}

	public void setSubmarca(Submarca submarca) {
		this.submarca = submarca;
	}
	
	
}
