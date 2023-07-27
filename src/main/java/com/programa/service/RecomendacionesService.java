package com.programa.service;

import java.util.List;

import com.programa.model.Recomendaciones;

public interface RecomendacionesService {

	List<Recomendaciones> findAll();

	void guardar(Recomendaciones recomendaciones);
	
	void eliminar(Recomendaciones recomendaciones);
	
}
