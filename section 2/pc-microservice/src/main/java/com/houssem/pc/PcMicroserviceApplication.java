package com.houssem.pc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.houssem.pc.entities.Pc;
import com.houssem.pc.repos.PcRepository;

@SpringBootApplication
public class PcMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcMicroserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PcRepository pcRepository) {
		return args -> {
			pcRepository.save(Pc.builder().modele("gf65").processeur("i7-13650HX").memoireRAM(32).capaciteStockage(512)
					.carteGraphique("RTX 4050").systemeExploitation("Windows 11").prix(3755)

					.build());

		};
	}
}
