package com.programa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programa.dao.ReservaDao;
import com.programa.model.Reserva;
import com.programa.service.ReservaService;

import jakarta.transaction.Transactional;

@Service
public class ReservaServiceImpl implements ReservaService{

	@Autowired
	ReservaDao reservaDao;

	@Transactional
	@Override
	public List<Reserva> findAll() {
		return reservaDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Reserva reserva) {
		reservaDao.save(reserva);
	}
	
	@Transactional
	@Override
	public void eliminar(Reserva reserva) {
		reservaDao.delete(reserva);
	}
}
