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

import com.portfolio.portfolio.model.Trabajo;
import com.portfolio.portfolio.service.ITrabajoService;

@RestController
@RequestMapping("/trabajos")
public class TrabajoController {

	@Autowired
	private ITrabajoService trabajoService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<Trabajo> verTrabajo(){	
		return trabajoService.verTrabajo();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Trabajo buscarTrabajo(@PathVariable(name = "id") long id) {
		return trabajoService.buscarTrabajo(id);
	}
		
	@PostMapping("/new")
	public void agregaTrabajo (@RequestBody Trabajo trabajo) {
				trabajoService.crearTrabajo(trabajo);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarTrabajo (@PathVariable Long id) {
		trabajoService.borrarTrabajo(id);
	}

}
