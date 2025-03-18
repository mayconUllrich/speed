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

import com.jupter.speed.dtos.SaleItemDto;
import com.jupter.speed.services.SaleItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sale-itens")
public class SaleItemController {
	
	@Autowired
	private SaleItemService saleItemService;
	
	@GetMapping
	public List<SaleItemDto> getAll() {
		return saleItemService.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody @Valid SaleItemDto saleItemDto) {
		saleItemService.insert(saleItemDto);
	}
	
	@PutMapping
	public SaleItemDto update(@RequestBody @Valid SaleItemDto saleItemDto) {
		saleItemService.update(saleItemDto);
		return saleItemDto;
	}
	
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("Id") Integer id) {
		saleItemService.delete(id);
		return ResponseEntity.ok().build();
	}
}
