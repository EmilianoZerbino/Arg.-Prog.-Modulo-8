package com.portfolio.portfolio.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="instituciones")
public class Institucion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String url_logo;
	
	@OneToMany(mappedBy = "institucion", fetch = FetchType.LAZY)
	private List<Especialidad> especialidades;
	
	@OneToMany(mappedBy = "institucion", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Trabajo> trabajos;
	
	public Institucion() {
		super();
	}

	public Institucion(long id, String nombre, String url_logo, List<Especialidad> especialidades,
			List<Institucion> instituciones) {
		this.id = id;
		this.nombre = nombre;
		this.url_logo = url_logo;
		this.especialidades = especialidades;
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

	public String getUrl_logo() {
		return url_logo;
	}

	public void setUrl_logo(String url_logo) {
		this.url_logo = url_logo;
	}

	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}

}
