package com.jupter.speed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jupter.speed.entities.SaleEntity;

public interface SaleRepository extends JpaRepository<SaleEntity, Integer> {

}
