package org.itstep.controller;

import org.itstep.service.SpringTestService;
import org.itstep.service.impl.SpringTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

	@Autowired
	SpringTestService service;
	
	@PostMapping
	public ResponseEntity<String> postMethod() {
		ResponseEntity<String> response = new ResponseEntity<String>(service.postMethod(), HttpStatus.OK);
		return response;
	}

	@GetMapping
	public ResponseEntity<String> getMethod() {
		ResponseEntity<String> response = new ResponseEntity<String>(service.getMethod(), HttpStatus.OK);
		return response;
	}

	@PutMapping
	public ResponseEntity<String> putMethod() {
		ResponseEntity<String> response = new ResponseEntity<String>(service.putMethod(), HttpStatus.OK);
		return response;
	}

	@DeleteMapping
	public ResponseEntity<String> deleteMethod() {
		ResponseEntity<String> response = new ResponseEntity<String>(service.deleteMethod(), HttpStatus.OK);
		return response;
	}
}
