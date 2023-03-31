package com.timal.app.prueba.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "marcas")
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ1")
	@SequenceGenerator(sequenceName = "customer_seq1", allocationSize = 1, name = "CUST_SEQ1")
	private Long id;
	
	@Column
	private String nombre;
	
	@OneToMany(mappedBy = "marca")
	private Set<Submarca> submarcas;
	
	

	public Set<Submarca> getSubmarcas() {
		return submarcas;
	}

	public void setSubmarcas(Set<Submarca> submarcas) {
		this.submarcas = submarcas;
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
	
	
}
