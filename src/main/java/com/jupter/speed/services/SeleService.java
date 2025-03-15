package com.jupter.speed.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupter.speed.dtos.SaleDto;
import com.jupter.speed.entities.SaleEntity;
import com.jupter.speed.repositories.SaleRepository;

@Service
public class SeleService {

	@Autowired
	private SaleRepository saleRepository;

	private SaleDto convertToDto(SaleEntity sale) {
		SaleDto saleDto = new SaleDto();
		saleDto.setId(sale.getId());
		saleDto.setDateOfSale(sale.getDateOfSale());
		saleDto.setTotalPrice(sale.getTotalPrice());
		return saleDto;
	}

	private SaleEntity convertToEntity(SaleDto saleDto) {
		SaleEntity sale = new SaleEntity();
		sale.setId(saleDto.getId());
		sale.setDateOfSale(saleDto.getDateOfSale());
		sale.setTotalPrice(saleDto.getTotalPrice());
		return sale;
	}

	public List<SaleDto> findAll() {
		List<SaleEntity> sales = saleRepository.findAll();
		return sales.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	public void insert(SaleDto saleDto) {
		SaleEntity sale = convertToEntity(saleDto);
		saleRepository.save(sale);
	}

	public SaleDto update(SaleDto saleDto) {
		SaleEntity sale = convertToEntity(saleDto);
		SaleEntity saleUpdated = saleRepository.save(sale);
		return convertToDto(saleUpdated);
	}

	public void delete(Integer id) {
		saleRepository.deleteById(id);
	}

	public SaleDto findById(Integer id) {
		SaleEntity sale = saleRepository.findById(id).get();
		return convertToDto(sale);
	}

}
