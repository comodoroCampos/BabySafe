package com.programa.service;

import java.util.List;

import com.programa.model.DisponibilidadHorario;

public interface DisponibilidadHorarioService {

	List<DisponibilidadHorario> findAll();

	void guardar(DisponibilidadHorario disponibilidadHorario);
	
	void eliminar(DisponibilidadHorario disponibilidadHorario);
	
}
