package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.SkillUsuario;
import com.portfolio.portfolio.repository.ISkillUsuarioRepository;


@Service
public class SkillUsuarioService implements ISkillUsuarioService{

	@Autowired
	public ISkillUsuarioRepository skillUsuarioRepository;
	
	@Override
	public List<SkillUsuario> verSkillUsuario() {
		return skillUsuarioRepository.findAll();
	}

	@Override
	public SkillUsuario buscarSkillUsuario(Long id) {
		return skillUsuarioRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearSkillUsuario(SkillUsuario skillUsuario) {
		skillUsuarioRepository.save(skillUsuario);
	}

	@Override
	public void borrarSkillUsuario(Long id) {
		skillUsuarioRepository.deleteById(id);
	}

}
