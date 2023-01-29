package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tecnologia_usuario")
public class TecnologiaUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int nivel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Tecnologia tecnologia;

	public TecnologiaUsuario() {
		super();
	}

	public TecnologiaUsuario(long id, int nivel, Usuario usuario, Tecnologia tecnologia) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.usuario = usuario;
		this.tecnologia = tecnologia;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
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

	public String getTecnologiaName() {
		if(tecnologia != null) {
			return tecnologia.getNombre();
			}else {
				return null;
			}
	}

	public void setTecnologia(Tecnologia tecnologia) {
		this.tecnologia = tecnologia;
	}
	
}
