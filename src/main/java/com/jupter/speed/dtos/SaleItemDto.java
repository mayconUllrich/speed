package com.jupter.speed.dtos;

import java.util.Objects;

import com.jupter.speed.entities.SaleEntity;
import com.jupter.speed.entities.StorangeEntity;

public class SaleItemDto {

	Integer id;
	Integer quantity;
	Double rebate;
	Double price;
	SaleEntity sale;
	StorangeEntity storange;

	// getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getRebate() {
		return rebate;
	}

	public void setRebate(Double rebate) {
		this.rebate = rebate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public SaleEntity getSale() {
		return sale;
	}

	public void setSale(SaleEntity sale) {
		this.sale = sale;
	}

	public StorangeEntity getStorange() {
		return storange;
	}

	public void setStorange(StorangeEntity storange) {
		this.storange = storange;
	}

	// hashCode and equals

	@Override
	public int hashCode() {
		return Objects.hash(id, price, quantity, rebate, sale, storange);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleItemDto other = (SaleItemDto) obj;
		return Objects.equals(id, other.id) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(rebate, other.rebate)
				&& Objects.equals(sale, other.sale) && Objects.equals(storange, other.storange);
	}

	// constructors

	public SaleItemDto() {
		super();
	}

}
