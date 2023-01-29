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
@Table(name="skills")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	
	@OneToMany(mappedBy = "skill", fetch = FetchType.LAZY)
	private List<SkillUsuario> skillUsuario;

	public Skill() {
		super();
	}

	public Skill(long id, String nombre, List<SkillUsuario> skillUsuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.skillUsuario = skillUsuario;
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
	public List<SkillUsuario> getSkillUsuario() {
		return skillUsuario;
	}
*/
	public void setSkillUsuario(List<SkillUsuario> skillUsuario) {
		this.skillUsuario = skillUsuario;
	}

}
