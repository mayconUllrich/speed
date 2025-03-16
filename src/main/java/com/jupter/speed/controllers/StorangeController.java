package com.jupter.speed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jupter.speed.dtos.StorangeDto;
import com.jupter.speed.services.StorangeService;

@RestController
@RequestMapping("/storange")
public class StorangeController {
	
	@Autowired
	private StorangeService storangeService;
	
	@GetMapping
	public List<StorangeDto> getAll() {
		return storangeService.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody StorangeDto storangeDto) {
		storangeService.insert(storangeDto);
	}
	
	@PutMapping
	public StorangeDto update(@RequestBody StorangeDto storangeDto) {
		storangeService.update(storangeDto);
		return storangeDto;
	}
	
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("Id") Integer id) {
		storangeService.delete(id);
		return ResponseEntity.ok().build();
	}

}
