package com.programa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programa.model.Reserva;

public interface ReservaDao extends JpaRepository<Reserva, Integer> {

}
