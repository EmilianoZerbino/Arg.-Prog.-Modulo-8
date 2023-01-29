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

import com.portfolio.portfolio.model.Skill;
import com.portfolio.portfolio.service.ISkillService;

@RestController
@RequestMapping("/skills")
public class SkillController {

	@Autowired
	private ISkillService skillService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<Skill> verSkill(){	
		return skillService.verSkill();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Skill buscarSkill(@PathVariable(name = "id") long id) {
		return skillService.buscarSkill(id);
	}
		
	@PostMapping("/new")
	public void agregaSkill (@RequestBody Skill skill) {
				skillService.crearSkill(skill);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarSkill (@PathVariable Long id) {
		skillService.borrarSkill(id);
	}

}
