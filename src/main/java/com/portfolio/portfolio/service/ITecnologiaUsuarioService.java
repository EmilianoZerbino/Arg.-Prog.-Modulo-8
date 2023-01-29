package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.TecnologiaUsuario;


public interface ITecnologiaUsuarioService {

	public List<TecnologiaUsuario> verTecnologiaUsuario();
	public void crearTecnologiaUsuario (TecnologiaUsuario tecnologiaUsuario);
	public void borrarTecnologiaUsuario (Long id);
	public TecnologiaUsuario buscarTecnologiaUsuario(Long id);
}
