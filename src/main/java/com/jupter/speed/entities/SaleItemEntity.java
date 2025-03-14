package com.jupter.speed.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "sale-item")
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
	@Column(name = "sale_id", nullable = false)
	SaleEntity sale;
	
	@ManyToOne
	@Column(name = "storange_id", nullable = false)
	StorangeEntity storange;
	
	
}