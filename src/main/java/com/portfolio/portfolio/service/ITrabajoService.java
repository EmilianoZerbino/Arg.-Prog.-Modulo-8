package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Trabajo;


public interface ITrabajoService {

	public List<Trabajo> verTrabajo();
	public void crearTrabajo (Trabajo trabajo);
	public void borrarTrabajo (Long id);
	public Trabajo buscarTrabajo(Long id);
}
