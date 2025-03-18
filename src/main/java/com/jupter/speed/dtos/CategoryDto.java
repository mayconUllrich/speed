package com.jupter.speed.dtos;

import java.util.Objects;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class CategoryDto {

	Integer id;
	@NotEmpty(message = "Nome é obrigatório.")
	@Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres.")
	String name;

	// Getters and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// HashCode and Equals

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryDto other = (CategoryDto) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	// Constructor

	public CategoryDto() {
		super();
	}
}
