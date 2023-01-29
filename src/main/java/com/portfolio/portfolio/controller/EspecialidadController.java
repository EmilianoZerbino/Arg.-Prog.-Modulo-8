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

import com.portfolio.portfolio.model.Especialidad;
import com.portfolio.portfolio.service.IEspecialidadService;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

	@Autowired
	private IEspecialidadService especialidadService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<Especialidad> verEspecialidad(){	
		return especialidadService.verEspecialidad();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Especialidad buscarEspecialidad(@PathVariable(name = "id") long id) {
		return especialidadService.buscarEspecialidad(id);
	}
		
	@PostMapping("/new")
	public void agregaEspecialidad (@RequestBody Especialidad especialidad) {
				especialidadService.crearEspecialidad(especialidad);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarEspecialidad (@PathVariable Long id) {
		especialidadService.borrarEspecialidad(id);
	}

}
