package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Tecnologia;


public interface ITecnologiaService {

	public List<Tecnologia> verTecnologia();
	public void crearTecnologia (Tecnologia tecnologia);
	public void borrarTecnologia (Long id);
	public Tecnologia buscarTecnologia(Long id);
}
