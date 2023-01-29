package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Trabajo;
import com.portfolio.portfolio.repository.ITrabajoRepository;


@Service
public class TrabajoService implements ITrabajoService{

	@Autowired
	public ITrabajoRepository trabajoRepository;
	
	@Override
	public List<Trabajo> verTrabajo() {
		return trabajoRepository.findAll();
	}

	@Override
	public Trabajo buscarTrabajo(Long id) {
		return trabajoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearTrabajo(Trabajo trabajo) {
		trabajoRepository.save(trabajo);
	}

	@Override
	public void borrarTrabajo(Long id) {
		trabajoRepository.deleteById(id);
	}

}
