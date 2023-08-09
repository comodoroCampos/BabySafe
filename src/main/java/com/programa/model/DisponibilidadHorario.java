package com.programa.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.programa.utils.Constantes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = DisponibilidadHorario.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "disponibilidad_horario", schema = Constantes.ECHEMA)
public class DisponibilidadHorario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3167792225910954433L;
	private Integer id;
	private Disponibilidad disponibilidad;
	private String hora;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_disponibilidad_horario")
	@SequenceGenerator(name = "sequence_disponibilidad_horario", sequenceName = "seq_disponibilidad_horario", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
	@Column(name = "id_disponibilidad_horario", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_disponibilidad", nullable = false)
	public Disponibilidad getDisponibilidad() {
		return disponibilidad;
	}


	@Column(name = "hora")
	public String getHora() {
		return hora;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}


	public void setDisponibilidad(Disponibilidad disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
