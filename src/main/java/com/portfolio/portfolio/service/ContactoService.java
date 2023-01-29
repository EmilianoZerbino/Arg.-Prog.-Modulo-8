package com.portfolio.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.model.Contacto;
import com.portfolio.portfolio.repository.IContactoRepository;


@Service
public class ContactoService implements IContactoService{

	@Autowired
	public IContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> verContacto() {
		return contactoRepository.findAll();
	}

	@Override
	public Contacto buscarContacto(Long id) {
		return contactoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearContacto(Contacto contacto) {
		contactoRepository.save(contacto);
	}

	@Override
	public void borrarContacto(Long id) {
		contactoRepository.deleteById(id);
	}

}
