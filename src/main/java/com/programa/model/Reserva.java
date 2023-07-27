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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Reserva.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "reserva", schema = Constantes.ECHEMA)
public class Reserva implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -20845408408484841L;
	private Integer id;
	private Date fechaReserva;
	private Date horaInicioReserva;
	private Date horaFinReserva;
	private Integer idNinera;
	private Integer idTutor;
	private Integer valorTotal;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_reserva")
	@SequenceGenerator(name = "sequence_reserva", sequenceName = "seq_reserva", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
	@Column(name = "id_reserva", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "fecha_reserva")
	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	@Column(name = "hora_inicio_reserva")
	public Date getHoraInicioReserva() {
		return horaInicioReserva;
	}

	public void setHoraInicioReserva(Date horaInicioReserva) {
		this.horaInicioReserva = horaInicioReserva;
	}

	@Column(name = "hora_fin_reserva")
	public Date getHoraFinReserva() {
		return horaFinReserva;
	}

	public void setHoraFinReserva(Date horaFinReserva) {
		this.horaFinReserva = horaFinReserva;
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

	@Column(name = "valor_total")
	public Integer getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}

}
