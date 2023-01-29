package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Formacion;


public interface IFormacionService {

	public List<Formacion> verFormacion();
	public void crearFormacion (Formacion formacion);
	public void borrarFormacion (Long id);
	public Formacion buscarFormacion(Long id);
}
