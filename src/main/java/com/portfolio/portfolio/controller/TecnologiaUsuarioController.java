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

import com.portfolio.portfolio.model.TecnologiaUsuario;
import com.portfolio.portfolio.service.ITecnologiaUsuarioService;

@RestController
@RequestMapping("/tecnologiasUsuarios")
public class TecnologiaUsuarioController {

	@Autowired
	private ITecnologiaUsuarioService tecnologiaUsuarioService;
		
	@GetMapping("/ver")
	@ResponseBody
	public List<TecnologiaUsuario> verTecnologiaUsuario(){	
		return tecnologiaUsuarioService.verTecnologiaUsuario();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public TecnologiaUsuario buscarTecnologiaUsuario(@PathVariable(name = "id") long id) {
		return tecnologiaUsuarioService.buscarTecnologiaUsuario(id);
	}
		
	@PostMapping("/new")
	public void agregaTecnologiaUsuario (@RequestBody TecnologiaUsuario tecnologiaUsuario) {
				tecnologiaUsuarioService.crearTecnologiaUsuario(tecnologiaUsuario);		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarTecnologiaUsuario (@PathVariable Long id) {
		tecnologiaUsuarioService.borrarTecnologiaUsuario(id);
	}

}
