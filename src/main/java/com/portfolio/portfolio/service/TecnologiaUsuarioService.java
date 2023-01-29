package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.TecnologiaUsuario;
import com.portfolio.portfolio.repository.ITecnologiaUsuarioRepository;


@Service
public class TecnologiaUsuarioService implements ITecnologiaUsuarioService{

	@Autowired
	public ITecnologiaUsuarioRepository tecnologiaUsuarioRepository;
	
	@Override
	public List<TecnologiaUsuario> verTecnologiaUsuario() {
		return tecnologiaUsuarioRepository.findAll();
	}

	@Override
	public TecnologiaUsuario buscarTecnologiaUsuario(Long id) {
		return tecnologiaUsuarioRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearTecnologiaUsuario(TecnologiaUsuario tecnologiaUsuario) {
		tecnologiaUsuarioRepository.save(tecnologiaUsuario);
	}

	@Override
	public void borrarTecnologiaUsuario(Long id) {
		tecnologiaUsuarioRepository.deleteById(id);
	}

}
