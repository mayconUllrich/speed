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

import com.jupter.speed.dtos.CategoryDto;
import com.jupter.speed.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// CRUD methods

	@GetMapping
	public List<CategoryDto> getAll() {
		return categoryService.findAll();
	}

	@PostMapping
	public void insert(@RequestBody CategoryDto categoryDto) {
		categoryService.insert(categoryDto);
	}

	@PutMapping
	public CategoryDto update(@RequestBody CategoryDto categoryDto) {
		categoryService.update(categoryDto);
		return categoryDto;
	}

	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable("Id") Integer id) {
		categoryService.delete(id);
		return ResponseEntity.ok().build();
	}
}
