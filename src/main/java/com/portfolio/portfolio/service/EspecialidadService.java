package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Especialidad;
import com.portfolio.portfolio.repository.IEspecialidadRepository;


@Service
public class EspecialidadService implements IEspecialidadService{

	@Autowired
	public IEspecialidadRepository especialidadRepository;
	
	@Override
	public List<Especialidad> verEspecialidad() {
		return especialidadRepository.findAll();
	}

	@Override
	public Especialidad buscarEspecialidad(Long id) {
		return especialidadRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearEspecialidad(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}

	@Override
	public void borrarEspecialidad(Long id) {
		especialidadRepository.deleteById(id);
	}

}
