package com.programa.model;

import java.io.Serializable;
import java.util.Date;

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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Ninera.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "ninera", schema = Constantes.ECHEMA)
public class Ninera implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 993752929734693898L;
	private Integer id;
	private String nombre;
	private String calleNumero;
	private String ciudad;
	private String region;
	private Date fechaNacimiento;
	private String estadoCivil;
	private String estudios;
	private Integer valorHora;
	private String correo;
	private String telefono;
	private String descripcion;
	private String foto;
	private String pass;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_ninera")
	@SequenceGenerator(name = "sequence_ninera", sequenceName = "seq_ninera", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
	@Column(name = "id_ninera", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "calle_numero")
	public String getCalleNumero() {
		return calleNumero;
	}

	public void setCalleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
	}

	@Column(name = "ciudad")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "region")
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Column(name = "fecha_nacimiento")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "estado_civil")
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "estudios")
	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	@Column(name = "valor_hora")
	public Integer getValorHora() {
		return valorHora;
	}

	public void setValorHora(Integer valorHora) {
		this.valorHora = valorHora;
	}

	@Column(name = "correo")
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "telefono")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "foto")
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Column(name = "pass")
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
