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

import com.portfolio.portfolio.model.Institucion;
import com.portfolio.portfolio.service.IInstitucionService;

@RestController
@RequestMapping("/instituciones")
public class InstitucionController {

	@Autowired
	private IInstitucionService institucionService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<Institucion> verInstitucion(){	
		return institucionService.verInstitucion();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Institucion buscarInstitucion(@PathVariable(name = "id") long id) {
		return institucionService.buscarInstitucion(id);
	}
		
	@PostMapping("/new")
	public void agregaInstitucion (@RequestBody Institucion institucion) {
				institucionService.crearInstitucion(institucion);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarInstitucion (@PathVariable Long id) {
		institucionService.borrarInstitucion(id);
	}

}
