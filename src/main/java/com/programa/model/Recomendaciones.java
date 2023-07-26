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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Recomendaciones.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tutor", schema = Constantes.ECHEMA)
public class Recomendaciones implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1032076170867563433L;
	private Integer id;
	private Integer idNinera;
	private Integer idTutor;
	private Integer calificacion;
	private String comentarios;
	private Date fecha;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_recomendaciones")
	@SequenceGenerator(name = "sequence_recomendaciones", sequenceName = "seq_recomendaciones", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "id_ninera")
	public Integer getIdNinera() {
		return idNinera;
	}

	public void setIdNinera(Integer idNinera) {
		this.idNinera = idNinera;
	}

	@Column(name = "id_tutor")
	public Integer getIdTutor() {
		return idTutor;
	}

	public void setIdTutor(Integer idTutor) {
		this.idTutor = idTutor;
	}

	@Column(name = "calificacion")
	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	@Column(name = "comentarios")
	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Column(name = "fecha")
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
