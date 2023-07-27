package com.programa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programa.dao.RecomendacionesDao;
import com.programa.model.Recomendaciones;
import com.programa.service.RecomendacionesService;

import jakarta.transaction.Transactional;

@Service
public class RecomendacionesServiceImpl implements RecomendacionesService {

	@Autowired
	RecomendacionesDao recomendacionesDao;

	@Transactional
	@Override
	public List<Recomendaciones> findAll() {
		return recomendacionesDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Recomendaciones recomendaciones) {
		recomendacionesDao.save(recomendaciones);
	}

	@Transactional
	@Override
	public void eliminar(Recomendaciones recomendaciones) {
		recomendacionesDao.delete(recomendaciones);
	}
	
}
