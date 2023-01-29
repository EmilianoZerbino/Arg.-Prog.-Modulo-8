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

import com.portfolio.portfolio.model.AcercaDe;
import com.portfolio.portfolio.model.Usuario;
import com.portfolio.portfolio.service.IAcercaDeService;
import com.portfolio.portfolio.service.IUsuarioService;


@RestController
@RequestMapping("/acerca_de")
public class AcercaDeController {

	@Autowired
	private IAcercaDeService acercaDeService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/ver")
	@ResponseBody
	public List<AcercaDe> verAcercaDe(){	
		return acercaDeService.verAcercaDe();	
	}
	
	@GetMapping("/ver/{id}")
	@ResponseBody
	public AcercaDe buscarAcercaDe(@PathVariable(name = "id") long id) {
		return acercaDeService.buscarAcercaDe(id);
	}
		
	@PostMapping("/new")
	public void agregaAcercaDe (@RequestBody AcercaDe acercaDe) {
		List<Usuario> listadoUsuarios = usuarioService.verUsuarios();
		for(Usuario usuario : listadoUsuarios) {
			if(usuario.getId()==acercaDe.getUsuarioId()) {//Valida que haya un Usuario con el Id de Usuario ingresado.
				List<AcercaDe> listadoAcercaDes = acercaDeService.verAcercaDe();
				for(AcercaDe existente : listadoAcercaDes) {
					if(existente.getUsuarioId()==acercaDe.getUsuarioId()) {
						acercaDe.setId(existente.getId());//evalua la existencia de algun acercaDe con el id_usuario ingresado, y de encontrarlo setea el Id 
					}
				}
				acercaDeService.crearAcercaDe(acercaDe);
			}
		}		
	}

	@DeleteMapping ("/delete/{id}")
	public void borrarAcercaDe (@PathVariable Long id) {
		acercaDeService.borrarAcercaDe(id);
	}
	
	@DeleteMapping ("/deleteByUserId/{id_usuario}")
	public void borrarAcercaDePorIdUsuario (@PathVariable Long id_usuario) {
		List<AcercaDe> listadoAcercaDes = acercaDeService.verAcercaDe();
		long id=0;
		for(AcercaDe existente : listadoAcercaDes) {
			if(existente.getUsuarioId()==id_usuario) {
				id=existente.getId();
			}
		}
		acercaDeService.borrarAcercaDe(id);
	}
}
