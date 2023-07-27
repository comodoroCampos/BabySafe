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

import com.programa.model.Ninera;
import com.programa.service.NineraService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api-ninera")
public class NineraController {

	@Autowired
	NineraService nineraService;

	@GetMapping("/nineras")
	public ResponseEntity<?> getTutores() {
		try {

			List<Ninera> nineras = new ArrayList<Ninera>();
			nineras.addAll(nineraService.findAll());

			if (nineras.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(nineras, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/tutor")
	public ResponseEntity<?> guardaNinera(@RequestBody Ninera ninera) {

		try {

			nineraService.guardar(ninera);
			return new ResponseEntity<>(ninera, HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
