package com.houssem.marque.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houssem.marque.entities.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
	Marque findByMarqueName(String marqueName);

}
