package com.jupter.speed.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "storange")
public class StorangeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "name", nullable = false, length = 50)
	String name;

	@Column(name = "price", nullable = false, length = 10)
	Double price;

	@Column(name = "quantity", nullable = false, length = 10)
	Integer quantity;

	@ManyToOne
	@Column(name = "category_id", nullable = false)
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

	@Override
	public int hashCode() {
	return Objects.hash(id, name, price, quantity);
	}

	// HashCode and Equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StorangeEntity other = (StorangeEntity) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity);
	}

	// Constructors

	public StorangeEntity() {
		super();
	}
}
