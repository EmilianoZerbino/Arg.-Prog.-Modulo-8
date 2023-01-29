package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.SkillUsuario;


public interface ISkillUsuarioService {

	public List<SkillUsuario> verSkillUsuario();
	public void crearSkillUsuario (SkillUsuario skillUsuario);
	public void borrarSkillUsuario (Long id);
	public SkillUsuario buscarSkillUsuario(Long id);
}
