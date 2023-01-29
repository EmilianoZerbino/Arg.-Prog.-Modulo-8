package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.AcercaDe;
import com.portfolio.portfolio.repository.IAcercaDeRepository;


@Service
public class AcercaDeService implements IAcercaDeService{

	@Autowired
	public IAcercaDeRepository acercaDeRepository;
	
	@Override
	public List<AcercaDe> verAcercaDe() {
		return acercaDeRepository.findAll();
	}

	@Override
	public AcercaDe buscarAcercaDe(Long id) {
		return acercaDeRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearAcercaDe(AcercaDe acercaDe) {
		acercaDeRepository.save(acercaDe);
	}

	@Override
	public void borrarAcercaDe(Long id) {
		acercaDeRepository.deleteById(id);
	}

}
