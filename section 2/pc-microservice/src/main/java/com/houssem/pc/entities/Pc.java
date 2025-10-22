package com.houssem.pc.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pc {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPc;
	private String modele;
	private String processeur;
	private int memoireRAM;
	private int capaciteStockage;
	private String carteGraphique;
	private String systemeExploitation;
	private double prix;
}
