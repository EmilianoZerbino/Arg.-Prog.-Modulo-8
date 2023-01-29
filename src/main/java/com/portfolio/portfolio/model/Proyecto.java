package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="proyectos")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String url_logo;
	private String url_proyecto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;

	public Proyecto() {
	}

	public Proyecto(long id, String nombre, String url_logo, String url_proyecto, Usuario usuario) {
		this.id = id;
		this.nombre = nombre;
		this.url_logo = url_logo;
		this.url_proyecto = url_proyecto;
		this.usuario = usuario;
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

	public String getUrl_proyecto() {
		return url_proyecto;
	}

	public void setUrl_proyecto(String url_proyecto) {
		this.url_proyecto = url_proyecto;
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
	
}
