package com.houssem.pc.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PcDto {
	
	private Long idPc;
	
	private String marqueName;
	
	
	private String modele;
	private String processeur;
	private int memoireRAM;
	private int capaciteStockage;
	private String carteGraphique;
	private String systemeExploitation;
	private double prix;
	
	
	private String country;
}
