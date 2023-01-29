package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Institucion;
import com.portfolio.portfolio.repository.IInstitucionRepository;


@Service
public class InstitucionService implements IInstitucionService{

	@Autowired
	public IInstitucionRepository institucionRepository;
	
	@Override
	public List<Institucion> verInstitucion() {
		return institucionRepository.findAll();
	}

	@Override
	public Institucion buscarInstitucion(Long id) {
		return institucionRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearInstitucion(Institucion institucion) {
		institucionRepository.save(institucion);
	}

	@Override
	public void borrarInstitucion(Long id) {
		institucionRepository.deleteById(id);
	}

}
