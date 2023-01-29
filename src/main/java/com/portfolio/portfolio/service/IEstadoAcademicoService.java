package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.EstadoAcademico;


public interface IEstadoAcademicoService {

	public List<EstadoAcademico> verEstadoAcademico();
	public void crearEstadoAcademico (EstadoAcademico estadoAcademico);
	public void borrarEstadoAcademico (Long id);
	public EstadoAcademico buscarEstadoAcademico(Long id);
}
