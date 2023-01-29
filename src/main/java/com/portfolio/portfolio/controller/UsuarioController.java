package com.portfolio.portfolio.controller;

import java.time.LocalDate;
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

import com.portfolio.portfolio.model.Usuario;
import com.portfolio.portfolio.service.IUsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/ver")
	@ResponseBody
	public List<Usuario> verUsuarios(){	
		return usuarioService.verUsuarios();		
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Usuario buscarUsuario(@PathVariable(name = "id") long id) {
		return usuarioService.buscarUsuario(id);
	}
		
	@PostMapping("/new")
	public void agregaUsuario (@RequestBody Usuario usuario) {
		System.out.println(usuario.getDni()+usuario.getNombres()+usuario.getApellidos()+usuario.getFechNac());
		System.out.println(LocalDate.now());
		usuarioService.crearUsuario(usuario);
	}

	@DeleteMapping ("/delete/{id}")
	public void borrerUsuario (@PathVariable Long id) {
		usuarioService.borrarUsuario(id);
	}
	
}
