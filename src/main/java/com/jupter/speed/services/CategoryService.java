package com.jupter.speed.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupter.speed.dtos.CategoryDto;
import com.jupter.speed.entities.CategoryEntity;
import com.jupter.speed.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	private CategoryDto convertToDto(CategoryEntity category) {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setId(category.getId());
		categoryDto.setName(category.getName());
		return categoryDto;
	}
	
	private CategoryEntity convertToEntity(CategoryDto categoryDto) {
		CategoryEntity category = new CategoryEntity();
		category.setId(categoryDto.getId());
		category.setName(categoryDto.getName());
		return category;
	}
	
	public List<CategoryDto> findAll() {
		List<CategoryEntity> categories = categoryRepository.findAll();
		return categories.stream().map(this::convertToDto).collect(Collectors.toList());
	}
	
	public void insert(CategoryDto categoryDto) {
		CategoryEntity category = convertToEntity(categoryDto);
		categoryRepository.save(category);
	}
	
	public CategoryDto update(CategoryDto categoryDto) {
		CategoryEntity category = convertToEntity(categoryDto);
		CategoryEntity categoryUpdated = categoryRepository.save(category); 
		return convertToDto(categoryUpdated);
	}
	
	public void delete(Integer id) {
		categoryRepository.deleteById(id);
	}
	
	public void findById(Integer id) {
		categoryRepository.findById(id);
	}
}
