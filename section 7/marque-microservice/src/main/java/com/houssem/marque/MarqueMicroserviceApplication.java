package com.houssem.marque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.houssem.marque.entities.Marque;
import com.houssem.marque.repos.MarqueRepository;

@SpringBootApplication
public class MarqueMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarqueMicroserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(MarqueRepository maruqeRepository) {
		return args -> {
			maruqeRepository.save(Marque.builder().marqueName("Dell").country("United States").build());
			maruqeRepository.save(Marque.builder().marqueName("Msi").country("Taiwan")

					.build());
		};
	}
}
