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

import com.portfolio.portfolio.model.EstadoAcademico;
import com.portfolio.portfolio.service.IEstadoAcademicoService;

@RestController
@RequestMapping("/estado_academico")
public class EstadoAcademicoController {

	@Autowired
	private IEstadoAcademicoService estadoAcademicoService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<EstadoAcademico> verEstadoAcademico(){	
		return estadoAcademicoService.verEstadoAcademico();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public EstadoAcademico buscarEstadoAcademico(@PathVariable(name = "id") long id) {
		return estadoAcademicoService.buscarEstadoAcademico(id);
	}
		
	@PostMapping("/new")
	public void agregaEstadoAcademico (@RequestBody EstadoAcademico estadoAcademico) {
				estadoAcademicoService.crearEstadoAcademico(estadoAcademico);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarEstadoAcademico (@PathVariable Long id) {
		estadoAcademicoService.borrarEstadoAcademico(id);
	}

}
