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

import com.portfolio.portfolio.model.Formacion;
import com.portfolio.portfolio.service.IFormacionService;

@RestController
@RequestMapping("/formaciones")
public class FormacionController {

	@Autowired
	private IFormacionService formacionService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<Formacion> verFormacion(){	
		return formacionService.verFormacion();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Formacion buscarFormacion(@PathVariable(name = "id") long id) {
		return formacionService.buscarFormacion(id);
	}
		
	@PostMapping("/new")
	public void agregaFormacion (@RequestBody Formacion formacion) {
				formacionService.crearFormacion(formacion);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarFormacion (@PathVariable Long id) {
		formacionService.borrarFormacion(id);
	}

}
