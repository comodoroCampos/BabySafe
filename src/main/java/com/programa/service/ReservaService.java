package com.programa.service;

import java.util.List;

import com.programa.model.Reserva;

public interface ReservaService {

	List<Reserva> findAll();

	void guardar(Reserva reserva);
	
	void eliminar(Reserva reserva);
	
}
