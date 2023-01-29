package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Tecnologia;
import com.portfolio.portfolio.repository.ITecnologiaRepository;


@Service
public class TecnologiaService implements ITecnologiaService{

	@Autowired
	public ITecnologiaRepository tecnologiaRepository;
	
	@Override
	public List<Tecnologia> verTecnologia() {
		return tecnologiaRepository.findAll();
	}

	@Override
	public Tecnologia buscarTecnologia(Long id) {
		return tecnologiaRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearTecnologia(Tecnologia tecnologia) {
		tecnologiaRepository.save(tecnologia);
	}

	@Override
	public void borrarTecnologia(Long id) {
		tecnologiaRepository.deleteById(id);
	}

}
