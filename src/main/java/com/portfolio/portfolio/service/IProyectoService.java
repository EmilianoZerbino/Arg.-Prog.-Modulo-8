package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Proyecto;


public interface IProyectoService {

	public List<Proyecto> verProyecto();
	public void crearProyecto (Proyecto acercaDe);
	public void borrarProyecto (Long id);
	public Proyecto buscarProyecto(Long id);
}
