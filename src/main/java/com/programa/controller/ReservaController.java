package com.programa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programa.model.Reserva;
import com.programa.service.ReservaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api-reserva")
public class ReservaController {

	@Autowired
	ReservaService reservaService;

	@GetMapping("/reservas")
	public ResponseEntity<?> getReservas() {
		try {

			List<Reserva> reservas = new ArrayList<Reserva>();
			reservas.addAll(reservaService.findAll());

			if (reservas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(reservas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/reserva")
	public ResponseEntity<?> guardaReserva(@RequestBody Reserva reserva) {

		try {
			reservaService.guardar(reserva);
			return new ResponseEntity<>(reserva, HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
