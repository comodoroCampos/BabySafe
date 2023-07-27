package com.programa.service;

import java.util.List;

import com.programa.model.Disponibilidad;

public interface DisponibilidadService {

	List<Disponibilidad> findAll();

	void guardar(Disponibilidad disponibilidad);
	
	void eliminar(Disponibilidad disponibilidad);
	
}
