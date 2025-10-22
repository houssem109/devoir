package com.houssem.pc.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.houssem.pc.dto.PcDto;
import com.houssem.pc.entities.Pc;
import com.houssem.pc.repos.PcRepository;


@AllArgsConstructor
@Service
public class PcServiceImpl implements PcService{
	
	 private PcRepository pcRepository;

	@Override
	public PcDto getPcById(Long id) {
		Pc pc = pcRepository.findById(id).get();
		 return new PcDto(
				 pc.getIdPc(),
				 pc.getModele(),
				 pc.getProcesseur(),
				 pc.getMemoireRAM(),
				 pc.getCapaciteStockage(),
				 pc.getCarteGraphique(),
				 pc.getSystemeExploitation(),
				 pc.getPrix()
				 );
				 }

	

}
