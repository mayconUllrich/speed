package com.jupter.speed.dtos;

import java.util.Objects;

import com.jupter.speed.entities.CategoryEntity;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StorangeDto {

	Integer id;
	@NotEmpty(message = "Nome é obrigatório.")
	@Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres.")
	String name;
	@NotNull(message = "Preço é obrigatório.")
	@DecimalMin(value = "0.0", inclusive = false, message = "preço deve ser maior que 0.")
	Double price;
	@NotNull(message = "Quantidade é obrigatória.")
	@Min(value = 0, message = "Quantidade deve ser maior que 0.")
	Integer quantity;
	@NotNull(message = "Categoria é obrigatória.")
	CategoryEntity category;

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	// HashCode and Equals
	
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StorangeDto other = (StorangeDto) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity);
	}

	// Constructor
	
	public StorangeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
