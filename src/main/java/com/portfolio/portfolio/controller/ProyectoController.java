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

import com.portfolio.portfolio.model.Proyecto;
import com.portfolio.portfolio.model.Usuario;
import com.portfolio.portfolio.service.IProyectoService;
import com.portfolio.portfolio.service.IUsuarioService;


@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

	@Autowired
	private IProyectoService proyectoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/ver")
	@ResponseBody
	public List<Proyecto> verProyecto(){	
		return proyectoService.verProyecto();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Proyecto buscarProyecto(@PathVariable(name = "id") long id) {
		return proyectoService.buscarProyecto(id);
	}
		
	@PostMapping("/new")
	public void agregaProyecto (@RequestBody Proyecto proyecto) {
		List<Usuario> listadoUsuarios = usuarioService.verUsuarios();
		for(Usuario usuario : listadoUsuarios) {
			if(usuario.getId()==proyecto.getUsuarioId()) {//Valida que haya un Usuario con el Id de Usuario ingresado.
				proyectoService.crearProyecto(proyecto);
			}
		}		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarProyecto (@PathVariable Long id) {
		proyectoService.borrarProyecto(id);
	}
	
	@DeleteMapping ("/deleteByUserId/{id_usuario}")
	public void borrarProyectoPorIdUsuario (@PathVariable Long id_usuario) {
		List<Proyecto> listadoProyectos = proyectoService.verProyecto();
		long id=0;
		for(Proyecto existente : listadoProyectos) {
			if(existente.getUsuarioId()==id_usuario) {
				id=existente.getId();
				proyectoService.borrarProyecto(id);
			}
		}
		
	}
}
