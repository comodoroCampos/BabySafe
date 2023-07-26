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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Disponibilidad.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "disponibilidad", schema = Constantes.ECHEMA)
public class Disponibilidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7328505360297581450L;
	private Integer id;
	private Integer idNinera;
	private Date fecha;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_disponibilidad")
	@SequenceGenerator(name = "sequence_disponibilidad", sequenceName = "seq_disponibilidad", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
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

	@Column(name = "fecha")
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
