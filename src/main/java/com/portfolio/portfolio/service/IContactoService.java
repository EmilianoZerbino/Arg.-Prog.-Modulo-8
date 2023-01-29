package com.portfolio.portfolio.service;

import java.util.List;

import com.portfolio.portfolio.model.Contacto;


public interface IContactoService {

	public List<Contacto> verContacto();
	public void crearContacto (Contacto contacto);
	public void borrarContacto (Long id);
	public Contacto buscarContacto(Long id);
}
