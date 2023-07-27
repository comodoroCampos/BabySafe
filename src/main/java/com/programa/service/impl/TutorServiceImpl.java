package com.programa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programa.dao.TutorDao;
import com.programa.model.Tutor;
import com.programa.service.TutorService;

import jakarta.transaction.Transactional;

@Service
public class TutorServiceImpl implements TutorService {

	@Autowired
	TutorDao tutorDao;

	@Transactional
	@Override
	public List<Tutor> findAll() {
		return tutorDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Tutor tutor) {
		tutorDao.save(tutor);
	}
	
	@Transactional
	@Override
	public void eliminar(Tutor tutor) {
		tutorDao.delete(tutor);
	}

}
