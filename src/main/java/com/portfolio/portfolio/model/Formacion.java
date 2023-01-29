package com.portfolio.portfolio.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="formaciones")
public class Formacion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Date inicio;
	private Date fin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private EstadoAcademico estadoAcademico;
	
	@ManyToOne(fetch = FetchType.LAZY)
	Especialidad especialidad;

	public Formacion() {
		super();
	}
	public Formacion(long id, Date inicio, Date fin, Usuario usuario) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
		this.usuario = usuario;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Long getUsuarioId() {
		if(usuario != null) {
		return usuario.getId();
		}else {
			return (long) 0;
		}
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void setEstadoAcademico(EstadoAcademico estadoAcademico) {
		this.estadoAcademico = estadoAcademico;
	}
	
	public String getEstadoAcademicoName() {
		if(estadoAcademico != null) {
			return estadoAcademico.getEstado();
			}else {
				return null;
			}
	}
	
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	public String getEspecialidadName() {
		if(especialidad != null) {
			return especialidad.getTitulo();
			}else {
				return null;
			}
	}

}
