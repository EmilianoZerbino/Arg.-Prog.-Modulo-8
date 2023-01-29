package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Encabezado;


public interface IEncabezadoService {

	public List<Encabezado> verEncabezado();
	public void crearEncabezado (Encabezado encabezado);
	public void borrarEncabezado (Long id);
	public Encabezado buscarEncabezado(Long id);
}
