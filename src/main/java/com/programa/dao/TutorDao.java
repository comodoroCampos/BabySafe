package com.programa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programa.model.Tutor;

public interface TutorDao extends JpaRepository<Tutor, Integer> {

}
