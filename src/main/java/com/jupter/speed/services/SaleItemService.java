package com.jupter.speed.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupter.speed.dtos.SaleItemDto;
import com.jupter.speed.entities.SaleItemEntity;
import com.jupter.speed.repositories.SaleItemRepository;

@Service
public class SaleItemService {

	@Autowired
	private SaleItemRepository saleItemRepository;

	private SaleItemDto convertToDto(SaleItemEntity saleItem) {
		SaleItemDto saleItemDto = new SaleItemDto();
		saleItemDto.setId(saleItem.getId());
		saleItemDto.setQuantity(saleItem.getQuantity());
		saleItemDto.setRebate(saleItem.getRebate());
		saleItemDto.setPrice(saleItem.getPrice());
		saleItemDto.setSale(saleItem.getSale());
		saleItemDto.setStorange(saleItem.getStorange());
		return saleItemDto;
	}

	private SaleItemEntity convertToEntity(SaleItemDto saleItemDto) {
		SaleItemEntity saleItem = new SaleItemEntity();
		saleItem.setId(saleItemDto.getId());
		saleItem.setQuantity(saleItemDto.getQuantity());
		saleItem.setRebate(saleItemDto.getRebate());
		saleItem.setPrice(saleItemDto.getPrice());
		saleItem.setSale(saleItemDto.getSale());
		saleItem.setStorange(saleItemDto.getStorange());
		return saleItem;
	}
	
	public List<SaleItemDto> findAll() {
		List<SaleItemEntity> saleItems = saleItemRepository.findAll();
		return saleItems.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	public void insert(SaleItemDto saleItemDto) {
		SaleItemEntity saleItem = convertToEntity(saleItemDto);
		saleItemRepository.save(saleItem);
	}

	public SaleItemDto update(SaleItemDto saleItemDto) {
		SaleItemEntity saleItem = convertToEntity(saleItemDto);
		SaleItemEntity saleItemUpdated = saleItemRepository.save(saleItem);
		return convertToDto(saleItemUpdated);
	}
	
	public SaleItemDto delete(Integer id) {
		SaleItemEntity saleItem = saleItemRepository.findById(id).get();
		SaleItemDto saleItemDto = convertToDto(saleItem);
		saleItemRepository.deleteById(id);
		return saleItemDto;
	}

	public SaleItemDto findById(Integer id) {
		SaleItemEntity saleItem = saleItemRepository.findById(id).get();
		return convertToDto(saleItem);
	}
}
