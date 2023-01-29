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
@Table(name="trabajos")
public class Trabajo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String funcion;
	private Date inicio;
	private Date fin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Institucion institucion;

	public Trabajo() {

	}

	public Trabajo(String funcion, Date inicio, Date fin, Usuario usuario, Institucion institucion) {
		this.funcion = funcion;
		this.inicio = inicio;
		this.fin = fin;
		this.usuario = usuario;
		this.institucion = institucion;
	}



	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
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

	public String getInstitucionName() {
		if(institucion != null) {
		return institucion.getNombre();
		}else {
			return null;
		}
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}
	
	
}
