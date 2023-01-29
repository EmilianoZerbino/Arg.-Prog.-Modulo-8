package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="encabezados")
public class Encabezado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String url_perfil;
	private String url_fondo;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Usuario usuario;

	public Encabezado() {
	}

	public Encabezado(long id, String url_perfil, String url_fondo, Usuario usuario) {
		this.id = id;
		this.url_perfil = url_perfil;
		this.url_fondo = url_fondo;
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl_perfil() {
		return url_perfil;
	}

	public void setUrl_perfil(String url_perfil) {
		this.url_perfil = url_perfil;
	}

	public String getUrl_fondo() {
		return url_fondo;
	}

	public void setUrl_fondo(String url_fondo) {
		this.url_fondo = url_fondo;
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