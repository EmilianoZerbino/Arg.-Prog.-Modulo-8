package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Usuario;


public interface IUsuarioService {

	public List<Usuario> verUsuarios();
	public void crearUsuario (Usuario usuario);
	public void borrarUsuario (Long id);
	public Usuario buscarUsuario(Long id);
}
