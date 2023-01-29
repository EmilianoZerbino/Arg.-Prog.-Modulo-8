package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Formacion;
import com.portfolio.portfolio.repository.IFormacionRepository;


@Service
public class FormacionService implements IFormacionService{

	@Autowired
	public IFormacionRepository formacionRepository;
	
	@Override
	public List<Formacion> verFormacion() {
		return formacionRepository.findAll();
	}

	@Override
	public Formacion buscarFormacion(Long id) {
		return formacionRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearFormacion(Formacion formacion) {
		formacionRepository.save(formacion);
	}

	@Override
	public void borrarFormacion(Long id) {
		formacionRepository.deleteById(id);
	}

}
