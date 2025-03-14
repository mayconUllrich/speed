package com.jupter.speed.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale")
public class SaleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "date-of-sale", nullable = false, updatable = false)
	@CreationTimestamp
	LocalDateTime dateOfSale;

	@Column(name = "total-price", nullable = false, length = 10)
	Double totalPrice;

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
		SaleEntity other = (SaleEntity) obj;
		return Objects.equals(dateOfSale, other.dateOfSale) && Objects.equals(id, other.id)
				&& Objects.equals(totalPrice, other.totalPrice);
	}

	public SaleEntity() {
		super();
	}

}
