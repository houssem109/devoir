package com.houssem.marque.restControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.houssem.marque.dto.MarqueDto;
import com.houssem.marque.service.MarqueService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/marques")
@AllArgsConstructor
public class MarqueController {
	private MarqueService marqueService;

	@GetMapping("{name}")
	public ResponseEntity<MarqueDto> getMarqueByName(@PathVariable("name") String name) {
		return new ResponseEntity<MarqueDto>(marqueService.getMarqueByName(name), HttpStatus.OK);
	}
}