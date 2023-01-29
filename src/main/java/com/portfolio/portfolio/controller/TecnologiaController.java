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

import com.portfolio.portfolio.model.Tecnologia;
import com.portfolio.portfolio.service.ITecnologiaService;

@RestController
@RequestMapping("/tecnologias")
public class TecnologiaController {

	@Autowired
	private ITecnologiaService tecnologiaService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<Tecnologia> verTecnologia(){	
		return tecnologiaService.verTecnologia();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Tecnologia buscarTecnologia(@PathVariable(name = "id") long id) {
		return tecnologiaService.buscarTecnologia(id);
	}
		
	@PostMapping("/new")
	public void agregaTecnologia (@RequestBody Tecnologia tecnologia) {
				tecnologiaService.crearTecnologia(tecnologia);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarTecnologia (@PathVariable Long id) {
		tecnologiaService.borrarTecnologia(id);
	}

}
