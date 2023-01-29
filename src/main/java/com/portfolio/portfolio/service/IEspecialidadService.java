package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Especialidad;


public interface IEspecialidadService {

	public List<Especialidad> verEspecialidad();
	public void crearEspecialidad (Especialidad especialidad);
	public void borrarEspecialidad (Long id);
	public Especialidad buscarEspecialidad(Long id);
}
