package com.portfolio.portfolio.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="especialidades")
public class Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String titulo;
	
	@OneToMany(mappedBy = "especialidad", fetch = FetchType.LAZY)
	private List<Formacion> formaciones;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Institucion institucion;

	public Especialidad() {
		
	}

	public Especialidad(long id, String titulo, List <Formacion> formaciones) {
		
		this.id = id;
		this.titulo = titulo;
		this.formaciones = formaciones;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
/*
	public List <Long> getFormacionesIds() {
		List<Long> ids= new ArrayList<Long>();
		for (Formacion formacion : formaciones) {
			ids.add(formacion.getId());
		}
		return ids;
	}

	public List<Formacion> getFormaciones() {
		return formaciones;
	}
*/
	public void setFormaciones(List<Formacion> formaciones) {
		this.formaciones = formaciones;
	}

	public String getInstitucionName() {
		return institucion.getNombre();
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

}
