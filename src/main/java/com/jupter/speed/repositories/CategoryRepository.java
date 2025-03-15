package com.jupter.speed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jupter.speed.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

}
