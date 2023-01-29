package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.EstadoAcademico;
import com.portfolio.portfolio.repository.IEstadoAcademicoRepository;


@Service
public class EstadoAcademicoService implements IEstadoAcademicoService{

	@Autowired
	public IEstadoAcademicoRepository estadoAcademicoRepository;
	
	@Override
	public List<EstadoAcademico> verEstadoAcademico() {
		return estadoAcademicoRepository.findAll();
	}

	@Override
	public EstadoAcademico buscarEstadoAcademico(Long id) {
		return estadoAcademicoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearEstadoAcademico(EstadoAcademico estadoAcademico) {
		estadoAcademicoRepository.save(estadoAcademico);
	}

	@Override
	public void borrarEstadoAcademico(Long id) {
		estadoAcademicoRepository.deleteById(id);
	}

}
