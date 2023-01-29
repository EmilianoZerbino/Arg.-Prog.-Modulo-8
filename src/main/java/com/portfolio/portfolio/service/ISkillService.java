package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Skill;


public interface ISkillService {

	public List<Skill> verSkill();
	public void crearSkill (Skill skill);
	public void borrarSkill (Long id);
	public Skill buscarSkill(Long id);
}
