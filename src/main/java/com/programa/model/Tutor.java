package com.programa.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.programa.utils.Constantes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Tutor.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tutor", schema = Constantes.ECHEMA)
public class Tutor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7610651167585449629L;
	private Integer id;
	private String nombres;
	private String apellidos;
	private String calleNumero;
	private String ciudad;
	private String region;
	private String correo;
	private String telefono;
	private String descripcion;
	private String foto;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_tutor")
	@SequenceGenerator(name = "sequence_tutor", sequenceName = "seq_tutor", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	@Column(name = "nombres")
	public String getNombres() {
		return nombres;
	}

	@Column(name = "apellidos")
	public String getApellidos() {
		return apellidos;
	}

	@Column(name = "calle_numero")
	public String getCalleNumero() {
		return calleNumero;
	}

	@Column(name = "ciudad")
	public String getCiudad() {
		return ciudad;
	}

	@Column(name = "region")
	public String getRegion() {
		return region;
	}

	@Column(name = "correo")
	public String getCorreo() {
		return correo;
	}

	@Column(name = "telefono")
	public String getTelefono() {
		return telefono;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	@Column(name = "foto")
	public String getFoto() {
		return foto;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setCalleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
