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

@Table(name = "submarcas")
@Entity
public class Submarca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ3")
	@SequenceGenerator(sequenceName = "customer_seq3", allocationSize = 1, name = "CUST_SEQ3")
	private Long id;
	
	@Column
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="marca")
	private Marca marca;
	
	@OneToMany(mappedBy = "submarca")
	private Set<Modelo> modelos;
	
	

	public Set<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(Set<Modelo> modelos) {
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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
}
