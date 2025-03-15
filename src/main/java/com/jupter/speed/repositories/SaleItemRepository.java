package com.jupter.speed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jupter.speed.entities.SaleItemEntity;

public interface SaleItemRepository extends JpaRepository<SaleItemEntity, Integer> {

}
