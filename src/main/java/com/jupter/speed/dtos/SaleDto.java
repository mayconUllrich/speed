package com.jupter.speed.dtos;

import java.time.LocalDateTime;
import java.util.Objects;

public class SaleDto {

	Integer id;
	LocalDateTime dateOfSale;
	Double totalPrice;

	// Getters and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(LocalDateTime dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	// HashCode and Equals

	@Override
	public int hashCode() {
		return Objects.hash(dateOfSale, id, totalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleDto other = (SaleDto) obj;
		return Objects.equals(dateOfSale, other.dateOfSale) && Objects.equals(id, other.id)
				&& Objects.equals(totalPrice, other.totalPrice);
	}

	// Constructor

	public SaleDto() {
		super();
	}
}
