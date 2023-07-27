package com.programa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programa.dao.DisponibilidadHorarioDao;
import com.programa.model.DisponibilidadHorario;
import com.programa.service.DisponibilidadHorarioService;

import jakarta.transaction.Transactional;

@Service
public class DisponibilidadHorarioServiceImpl implements DisponibilidadHorarioService {

	@Autowired
	DisponibilidadHorarioDao disponibilidadHorarioDao;

	@Transactional
	@Override
	public List<DisponibilidadHorario> findAll() {
		return disponibilidadHorarioDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(DisponibilidadHorario disponibilidadHorario) {
		disponibilidadHorarioDao.save(disponibilidadHorario);
	}
	
	@Transactional
	@Override
	public void eliminar(DisponibilidadHorario disponibilidadHorario) {
		disponibilidadHorarioDao.delete(disponibilidadHorario);
	}

}
