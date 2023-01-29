package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="skill_usuario")
public class SkillUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int nivel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Skill skill;

	
	public SkillUsuario() {
		super();
	}

	public SkillUsuario(long id, int nivel, Usuario usuario, Skill skill) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.usuario = usuario;
		this.skill = skill;
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

	public String getSkillName() {
		if(skill != null) {
		return skill.getNombre();
		}else {
			return null;
		}
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
}
