package com.houssem.marque.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.houssem.marque.config.Configuration;
import com.houssem.marque.dto.MarqueDto;
import com.houssem.marque.service.MarqueService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/marques")
//@AllArgsConstructor
public class MarqueController {
	private MarqueService marqueService;
	/*
	@Value("${build.version}")
	private String buildVersion;

	@Autowired
	Configuration configuration;
	*/
	
	/*
	@GetMapping("/author")
	public ResponseEntity<String> retrieveAuthorInfo() {
	 return ResponseEntity.status(HttpStatus.OK)
	 .body(configuration.getName()+" "+configuration.getEmail() );
	}
	


	@GetMapping("/version")
	public ResponseEntity<String> version()
	{
	 return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
	}
	*/
	public MarqueController(MarqueService marqueService) {
		
		this.marqueService = marqueService;
	}
	@GetMapping("{name}")
	public ResponseEntity<MarqueDto> getMarqueByName(@PathVariable("name") String name) {
		return new ResponseEntity<MarqueDto>(marqueService.getMarqueByName(name), HttpStatus.OK);
	}
}