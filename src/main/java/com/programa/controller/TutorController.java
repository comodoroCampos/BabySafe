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

import com.programa.model.Tutor;
import com.programa.service.TutorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api-tutor")
public class TutorController {

	@Autowired
	TutorService tutorService;
	
	@GetMapping("/tutores")
	public ResponseEntity<?> getTutores() {
		try {
			
			List<Tutor> tutores= new ArrayList<Tutor>();
			tutores.addAll(tutorService.findAll());
			
			if (tutores.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(tutores, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/tutor")
	public ResponseEntity<?> guardaTutor(@RequestBody Tutor tutor) {
		
		try {
	
			
			tutorService.guardar(tutor);
			return new ResponseEntity<>(tutor, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
