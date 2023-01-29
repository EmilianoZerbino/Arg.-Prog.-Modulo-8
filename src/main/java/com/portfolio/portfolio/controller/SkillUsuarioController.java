package com.portfolio.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfolio.model.SkillUsuario;
import com.portfolio.portfolio.service.ISkillUsuarioService;

@RestController
@RequestMapping("/skillsUsuarios")
public class SkillUsuarioController {

	@Autowired
	private ISkillUsuarioService skillUsuarioService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<SkillUsuario> verSkillUsuario(){	
		return skillUsuarioService.verSkillUsuario();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public SkillUsuario buscarSkillUsuario(@PathVariable(name = "id") long id) {
		return skillUsuarioService.buscarSkillUsuario(id);
	}
		
	@PostMapping("/new")
	public void agregaSkillUsuario (@RequestBody SkillUsuario skillUsuario) {
				skillUsuarioService.crearSkillUsuario(skillUsuario);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarSkillUsuario (@PathVariable Long id) {
		skillUsuarioService.borrarSkillUsuario(id);
	}

}
