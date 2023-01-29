package com.portfolio.portfolio.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String dni;
	private String nombres;
	private String apellidos;
	private Date fechNac;
	
	@OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private Encabezado encabezado;
	
	@OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private AcercaDe acercaDe;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Contacto> contactos;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Proyecto> proyectos;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Formacion> formaciones;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Trabajo> trabajos;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<SkillUsuario> skillsUsuario;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<TecnologiaUsuario> tecnologiaUsuario;
	
	public long getId() {
		return id;
	}
	
	
	public Usuario() {
		super();
	}

	public Usuario(long id, String dni, String nombres, String apellidos, Date fechNac, Encabezado encabezado,
			AcercaDe acercaDe, List<Contacto> contactos, List<Proyecto> proyectos, List<Formacion> formaciones,
			List<Trabajo> trabajos, List<SkillUsuario> skillsUsuario, List<TecnologiaUsuario> tecnologiaUsuario) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechNac = fechNac;
		this.encabezado = encabezado;
		this.acercaDe = acercaDe;
		this.contactos = contactos;
		this.proyectos = proyectos;
		this.formaciones = formaciones;
		this.trabajos = trabajos;
		this.skillsUsuario = skillsUsuario;
		this.tecnologiaUsuario = tecnologiaUsuario;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechNac() {
		return fechNac;
	}
	public void setFechNac(Date fechNac) {
		this.fechNac = fechNac;
	}
	
	public Encabezado getEncabezado() {
		return encabezado;
	}
	public void setEncabezado(Encabezado encabezado) {
		this.encabezado = encabezado;
	}
	
	public List<Formacion> getFormaciones() {
		return formaciones;
	}
	public void setFormaciones(List<Formacion> formaciones) {
		this.formaciones = formaciones;
	}
	
	public List<Trabajo> getTrabajos() {
		return trabajos;
	}
	public void setTrabajos(List<Trabajo> trabajos) {
		this.trabajos = trabajos;
	}
	
	public AcercaDe getAcercaDe() {
		return acercaDe;
	}
	public void setAcercaDe(AcercaDe acercaDe) {
		this.acercaDe = acercaDe;
	}


	public List<Contacto> getContactos() {
		return contactos;
	}


	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}


	public List<Proyecto> getProyectos() {
		return proyectos;
	}


	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public List<SkillUsuario> getSkillUsuario() {
		return skillsUsuario;
	}
	public void setSkillUsuario(List<SkillUsuario> skillUsuario) {
		this.skillsUsuario = skillUsuario;
	}
	
	public List<TecnologiaUsuario> getTecnologiaUsuario() {
		return tecnologiaUsuario;
	}
	public void setTecnologiaUsuario(List<TecnologiaUsuario> tecnologiaUsuario) {
		this.tecnologiaUsuario = tecnologiaUsuario;
	}
	
}
