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

import com.portfolio.portfolio.model.Contacto;
import com.portfolio.portfolio.model.Usuario;
import com.portfolio.portfolio.service.IContactoService;
import com.portfolio.portfolio.service.IUsuarioService;


@RestController
@RequestMapping("/contactos")
public class ContactoController {

	@Autowired
	private IContactoService contactoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/ver")
	@ResponseBody
	public List<Contacto> verContacto(){	
		return contactoService.verContacto();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Contacto buscarContacto(@PathVariable(name = "id") long id) {
		return contactoService.buscarContacto(id);
	}
		
	@PostMapping("/new")
	public void agregaContacto (@RequestBody Contacto contacto) {
		List<Usuario> listadoUsuarios = usuarioService.verUsuarios();
		for(Usuario usuario : listadoUsuarios) {
			if(usuario.getId()==contacto.getUsuarioId()) {//Valida que haya un Usuario con el Id de Usuario ingresado.
				contactoService.crearContacto(contacto);
			}
		}		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarContacto (@PathVariable Long id) {
		contactoService.borrarContacto(id);
	}
	
	@DeleteMapping ("/deleteByUserId/{id_usuario}")
	public void borrarContactoPorIdUsuario (@PathVariable Long id_usuario) {
		List<Contacto> listadoContactos = contactoService.verContacto();
		long id=0;
		for(Contacto existente : listadoContactos) {
			if(existente.getUsuarioId()==id_usuario) {
				id=existente.getId();
				contactoService.borrarContacto(id);
			}
		}
		
	}
}
