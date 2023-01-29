package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Usuario;
import com.portfolio.portfolio.repository.IUsuarioRepository;


@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	public IUsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> verUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario buscarUsuario(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void borrarUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}

	

}
