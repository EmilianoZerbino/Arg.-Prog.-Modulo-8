package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="acerca_de")
public class AcercaDe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String acerca_de;
	

	@OneToOne(fetch = FetchType.LAZY)
	private  Usuario usuario;


	public AcercaDe() {
	}


	public AcercaDe(long id, String acerca_de, Usuario usuario) {
		this.id = id;
		this.acerca_de = acerca_de;
		this.usuario = usuario;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAcerca_de() {
		return acerca_de;
	}


	public void setAcerca_de(String acerca_de) {
		this.acerca_de = acerca_de;
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