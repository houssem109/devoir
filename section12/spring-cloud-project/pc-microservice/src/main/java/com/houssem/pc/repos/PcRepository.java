package com.houssem.pc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houssem.pc.entities.Pc;

public interface PcRepository extends JpaRepository<Pc, Long> {
	
}
