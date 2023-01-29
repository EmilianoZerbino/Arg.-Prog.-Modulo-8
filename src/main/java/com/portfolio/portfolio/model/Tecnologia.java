package com.portfolio.portfolio.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tecnologias")
public class Tecnologia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	@OneToMany(mappedBy = "tecnologia", fetch = FetchType.LAZY)
	private List<TecnologiaUsuario> tecnologiaUsuario;

	public Tecnologia() {
		super();
	}

	public Tecnologia(long id, String nombre, List<TecnologiaUsuario> tecnologiaUsuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tecnologiaUsuario = tecnologiaUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/*
	public List<Tecnologia_Usuario> getTecnologiaUsuario() {
		return tecnologiaUsuario;
	}
*/
	public void setTecnologiaUsuario(List<TecnologiaUsuario> tecnologiaUsuario) {
		this.tecnologiaUsuario = tecnologiaUsuario;
	}
	
	
	
}
