package com.houssem.marque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssem.marque.dto.MarqueDto;
import com.houssem.marque.entities.Marque;
import com.houssem.marque.repos.MarqueRepository;

@Service
public class MarqueServiceImpl implements MarqueService {

	@Autowired
	MarqueRepository marqueRepository;

	@Override
	public MarqueDto getMarqueByName(String name) {
		Marque mar = marqueRepository.findByMarqueName(name);
		MarqueDto marqueDto = new MarqueDto(
				mar.getIdMarque(), 
				mar.getMarqueName()
		);
		return marqueDto;
	}
}
