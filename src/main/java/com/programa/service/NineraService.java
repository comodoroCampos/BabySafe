package com.programa.service;

import java.util.List;

import com.programa.model.Ninera;

public interface NineraService {

	List<Ninera> findAll();

	void guardar(Ninera ninera);
	
	void eliminar(Ninera ninera);
	
}
