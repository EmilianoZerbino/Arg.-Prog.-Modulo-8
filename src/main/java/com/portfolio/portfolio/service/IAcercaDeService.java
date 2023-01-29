package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.AcercaDe;


public interface IAcercaDeService {

	public List<AcercaDe> verAcercaDe();
	public void crearAcercaDe (AcercaDe acercaDe);
	public void borrarAcercaDe (Long id);
	public AcercaDe buscarAcercaDe(Long id);
}
