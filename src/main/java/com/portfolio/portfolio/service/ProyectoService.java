package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Proyecto;
import com.portfolio.portfolio.repository.IProyectoRepository;


@Service
public class ProyectoService implements IProyectoService{

	@Autowired
	public IProyectoRepository proyectoRepository;
	
	@Override
	public List<Proyecto> verProyecto() {
		return proyectoRepository.findAll();
	}

	@Override
	public Proyecto buscarProyecto(Long id) {
		return proyectoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearProyecto(Proyecto proyecto) {
		proyectoRepository.save(proyecto);
	}

	@Override
	public void borrarProyecto(Long id) {
		proyectoRepository.deleteById(id);
	}

}
