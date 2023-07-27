package com.programa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programa.dao.DisponibilidadDao;
import com.programa.model.Disponibilidad;
import com.programa.service.DisponibilidadService;

import jakarta.transaction.Transactional;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

	@Autowired
	DisponibilidadDao disponibilidadDao;

	@Transactional
	@Override
	public List<Disponibilidad> findAll() {
		return disponibilidadDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Disponibilidad disponibilidad) {
		disponibilidadDao.save(disponibilidad);
	}
	
	@Transactional
	@Override
	public void eliminar(Disponibilidad disponibilidad) {
		disponibilidadDao.delete(disponibilidad);
	}
}
