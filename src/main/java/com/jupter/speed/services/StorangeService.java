package com.jupter.speed.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupter.speed.dtos.StorangeDto;
import com.jupter.speed.entities.StorangeEntity;
import com.jupter.speed.repositories.StorangeRepository;

@Service
public class StorangeService {

	@Autowired
	private StorangeRepository storangeRepository;

	private StorangeDto convertToDto(StorangeEntity storange) {
		StorangeDto storangeDto = new StorangeDto();
		storangeDto.setId(storange.getId());
		storangeDto.setQuantity(storange.getQuantity());
		storangeDto.setPrice(storange.getPrice());
		storangeDto.setCategory(storange.getCategory());
		return storangeDto;
	}

	private StorangeEntity convertToEntity(StorangeDto storangeDto) {
		StorangeEntity storange = new StorangeEntity();
		storange.setId(storangeDto.getId());
		storange.setQuantity(storangeDto.getQuantity());
		storange.setPrice(storangeDto.getPrice());
		storange.setCategory(storangeDto.getCategory());
		return storange;
	}
	
	public List<StorangeDto> findAll() {
		List<StorangeEntity> storanges = storangeRepository.findAll();
		return storanges.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	public void insert(StorangeDto storangeDto) {
		StorangeEntity storange = convertToEntity(storangeDto);
		storangeRepository.save(storange);
	}

	public StorangeDto update(StorangeDto storangeDto) {
		StorangeEntity storange = convertToEntity(storangeDto);
		StorangeEntity storangeUpdated = storangeRepository.save(storange);
		return convertToDto(storangeUpdated);
	}

	public StorangeDto delete(Integer id) {
		StorangeEntity storange = storangeRepository.findById(id).get();
		StorangeDto storangeDto = convertToDto(storange);
		storangeRepository.deleteById(id);
		return storangeDto;
	}

	public StorangeDto findById(Integer id) {
		StorangeEntity storange = storangeRepository.findById(id).get();
		return convertToDto(storange);
	}
}
