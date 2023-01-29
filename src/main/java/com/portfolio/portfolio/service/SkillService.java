package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Skill;
import com.portfolio.portfolio.repository.ISkillRepository;


@Service
public class SkillService implements ISkillService{

	@Autowired
	public ISkillRepository skillRepository;
	
	@Override
	public List<Skill> verSkill() {
		return skillRepository.findAll();
	}

	@Override
	public Skill buscarSkill(Long id) {
		return skillRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearSkill(Skill skill) {
		skillRepository.save(skill);
	}

	@Override
	public void borrarSkill(Long id) {
		skillRepository.deleteById(id);
	}

}
