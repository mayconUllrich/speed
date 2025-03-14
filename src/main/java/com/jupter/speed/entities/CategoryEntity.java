package com.jupter.speed.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="category")
@Entity
public class CategoryEntity {
	Integer id;
	String name;
}
