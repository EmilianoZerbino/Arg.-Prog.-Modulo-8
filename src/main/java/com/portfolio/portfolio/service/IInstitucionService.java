package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Institucion;


public interface IInstitucionService {

	public List<Institucion> verInstitucion();
	public void crearInstitucion (Institucion institucion);
	public void borrarInstitucion (Long id);
	public Institucion buscarInstitucion(Long id);
}
