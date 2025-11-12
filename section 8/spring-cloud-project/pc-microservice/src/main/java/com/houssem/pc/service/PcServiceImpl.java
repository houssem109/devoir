package com.houssem.pc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.houssem.pc.dto.APIResponseDto;
import com.houssem.pc.dto.MarqueDto;
import com.houssem.pc.dto.PcDto;
import com.houssem.pc.entities.Pc;
import com.houssem.pc.repos.PcRepository;

@AllArgsConstructor
@Service
public class PcServiceImpl implements PcService{
	
	 private PcRepository pcRepository;
	 // WebClient webClient;
	 private APIClient apiClient;

	@Override
	public APIResponseDto getPcById(Long id) {
		Pc pc = pcRepository.findById(id).get();
		
//		
//		MarqueDto marqueDto = webClient.get().uri("http://localhost:8080/api/marques/" +
//				pc.getMarqueName())
//				 .retrieve()
//				 .bodyToMono(MarqueDto.class)
//				 .block();

		MarqueDto marqueDto = apiClient.getMarqueByName(pc.getMarqueName());
		
		 PcDto pcDto = new PcDto(
				 pc.getIdPc(),
				 pc.getModele(),
				 pc.getMarqueName(),
				 pc.getProcesseur(),
				 pc.getMemoireRAM(),
				 pc.getCapaciteStockage(),
				 pc.getCarteGraphique(),
				 pc.getSystemeExploitation(),
				 pc.getPrix(),
				 marqueDto.getCountry()
				 );
				 

	APIResponseDto apiResponseDto = new APIResponseDto();
	 apiResponseDto.setPcDto(pcDto);
	 apiResponseDto.setMarqueDto(marqueDto);
	 return apiResponseDto;
}}
