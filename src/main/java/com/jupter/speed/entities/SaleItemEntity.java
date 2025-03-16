package com.jupter.speed.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale-itens")
public class SaleItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "quantity", nullable = false, length = 10)
	Integer quantity;

	@Column(name = "rebate", nullable = false, length = 10)
	Double rebate;

	@Column(name = "price", nullable = false, length = 10)
	Double price;

	@ManyToOne
	@JoinColumn(name = "sale_id", nullable = false, unique = false)
	SaleEntity sale;

	@ManyToOne
	@JoinColumn(name = "storange_id", nullable = false, unique = false)
	StorangeEntity storange;

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
		SaleItemEntity other = (SaleItemEntity) obj;
		return Objects.equals(id, other.id) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(rebate, other.rebate)
				&& Objects.equals(sale, other.sale) && Objects.equals(storange, other.storange);
	}

	public SaleItemEntity() {
		super();
	}
}