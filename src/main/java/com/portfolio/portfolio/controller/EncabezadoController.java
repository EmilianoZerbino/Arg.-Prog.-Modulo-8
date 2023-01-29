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

import com.portfolio.portfolio.model.Encabezado;
import com.portfolio.portfolio.model.Usuario;
import com.portfolio.portfolio.service.IEncabezadoService;
import com.portfolio.portfolio.service.IUsuarioService;


@RestController
@RequestMapping("/encabezados")
public class EncabezadoController {

	@Autowired
	private IEncabezadoService encabezadoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/ver")
	@ResponseBody
	public List<Encabezado> verEncabezado(){	
		return encabezadoService.verEncabezado();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public Encabezado buscarEncabezado(@PathVariable(name = "id") long id) {
		return encabezadoService.buscarEncabezado(id);
	}
		
	@PostMapping("/new")
	public void agregaEncabezado (@RequestBody Encabezado encabezado) {
		List<Usuario> listadoUsuarios = usuarioService.verUsuarios();
		for(Usuario usuario : listadoUsuarios) {
			if(usuario.getId()==encabezado.getUsuarioId()) {//Valida que haya un Usuario con el Id de Usuario ingresado.
				List<Encabezado> listadoEncabezados = encabezadoService.verEncabezado();
				for(Encabezado existente : listadoEncabezados) {
					if(existente.getUsuarioId()==encabezado.getUsuarioId()) {
						encabezado.setId(existente.getId());//evalua la existencia de algun encabezado con el id_usuario ingresado, y de encontrarlo setea el Id 
					}
				}
				encabezadoService.crearEncabezado(encabezado);
			}
		}		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarEncabezado (@PathVariable Long id) {
		encabezadoService.borrarEncabezado(id);
	}
	
	@DeleteMapping ("/deleteByUserId/{id_usuario}")
	public void borrarEncabezadoPorIdUsuario (@PathVariable Long id_usuario) {
		List<Encabezado> listadoEncabezados = encabezadoService.verEncabezado();
		long id=0;
		for(Encabezado existente : listadoEncabezados) {
			if(existente.getUsuarioId()==id_usuario) {
				id=existente.getId();
			}
		}
		encabezadoService.borrarEncabezado(id);
	}
}
