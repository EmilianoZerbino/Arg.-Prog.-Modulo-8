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
@Table(name="estado_academico")
public class EstadoAcademico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String estado;
	
	@OneToMany(mappedBy = "estadoAcademico", fetch = FetchType.LAZY)
	private List<Formacion> formaciones;

	public EstadoAcademico() {
		super();
	}

	public EstadoAcademico(long id, String estado, List<Formacion> formaciones) {
		super();
		this.id = id;
		this.estado = estado;
		this.formaciones = formaciones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setFormaciones(List<Formacion> formaciones) {
		this.formaciones = formaciones;
	}
	
}
