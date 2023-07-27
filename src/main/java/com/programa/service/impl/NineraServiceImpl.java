package com.programa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programa.dao.NineraDao;
import com.programa.model.Ninera;
import com.programa.service.NineraService;

import jakarta.transaction.Transactional;

@Service
public class NineraServiceImpl implements NineraService {

	@Autowired
	NineraDao nineraDao;

	@Transactional
	@Override
	public List<Ninera> findAll() {
		return nineraDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Ninera ninera) {
		nineraDao.save(ninera);
	}

	@Transactional
	@Override
	public void eliminar(Ninera ninera) {
		nineraDao.delete(ninera);
	}
	
}
