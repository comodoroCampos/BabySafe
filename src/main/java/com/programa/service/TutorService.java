package com.programa.service;

import java.util.List;

import com.programa.model.Tutor;

public interface TutorService {

	List<Tutor> findAll();

	void guardar(Tutor tutor);
	
	void eliminar(Tutor tutor);

}
