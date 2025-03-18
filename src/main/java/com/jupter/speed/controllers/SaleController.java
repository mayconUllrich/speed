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

import com.jupter.speed.dtos.SaleDto;
import com.jupter.speed.services.SaleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sale")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	// CRUD methods
	
	@GetMapping
	public List<SaleDto> getAll() {
		return saleService.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody @Valid SaleDto saleDto) {
		saleService.insert(saleDto);
	}
	
	@PutMapping
	public SaleDto update(@RequestBody @Valid SaleDto saleDto) {
		saleService.update(saleDto);
		return saleDto;
	}
	
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("Id") Integer id) {
		saleService.delete(id);
		return ResponseEntity.ok().build();
	}
	
}
