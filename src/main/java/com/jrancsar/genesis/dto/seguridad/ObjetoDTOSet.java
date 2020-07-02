package com.jrancsar.genesis.dto.seguridad;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.jrancsar.genesis.entities.seguridad.Objeto;

public class ObjetoDTOSet implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="El campo obligatorio.")
	@NotNull(message="El campo no puede ser nulo")
	@Length(min=3, max=25, message="Tamaño de texto: min 3 y max 25")
	@NotBlank
	private String nObjeto;
	@NotEmpty(message="El campo obligatorio.")
	@NotNull(message="El campo no puede ser nulo")
	@Length(min=3, max=50, message="Tamaño de texto: min 3 y max 50")
	@NotBlank
	private String descripcion;
	@NotEmpty(message="El campo obligatorio.")
	@NotNull(message="El campo no puede ser nulo")
	private Integer objetoPadre;
	@NotEmpty(message="El campo obligatorio.")
	@NotNull(message="El campo no puede ser nulo")
	private String comando;	
	@NotNull(message="El campo no puede ser nulo")
	private Boolean activo;

	public ObjetoDTOSet() {		
	}
	
	public ObjetoDTOSet(Objeto objeto) {				
		this.nObjeto = objeto.getnObjeto();
		this.descripcion = objeto.getDescripcion();
		this.objetoPadre = objeto.getObjetoPadre();
		this.comando = objeto.getComando();
		this.activo = objeto.getActivo();		
	}

	public String getnObjeto() {
		return nObjeto;
	}

	public void setnObjeto(String nObjeto) {
		this.nObjeto = nObjeto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getObjetoPadre() {
		return objetoPadre;
	}

	public void setObjetoPadre(Integer objetoPadre) {
		this.objetoPadre = objetoPadre;
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
}
