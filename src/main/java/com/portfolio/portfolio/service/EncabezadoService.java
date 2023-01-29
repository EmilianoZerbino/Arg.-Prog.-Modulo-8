package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Encabezado;
import com.portfolio.portfolio.repository.IEncabezadoRepository;


@Service
public class EncabezadoService implements IEncabezadoService{

	@Autowired
	public IEncabezadoRepository encabezadoRepository;
	
	@Override
	public List<Encabezado> verEncabezado() {
		return encabezadoRepository.findAll();
	}

	@Override
	public Encabezado buscarEncabezado(Long id) {
		return encabezadoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearEncabezado(Encabezado encabezado) {
		encabezadoRepository.save(encabezado);
	}

	@Override
	public void borrarEncabezado(Long id) {
		encabezadoRepository.deleteById(id);
	}

}
