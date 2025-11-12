package com.houssem.pc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

import com.houssem.pc.dto.APIResponseDto;
import com.houssem.pc.dto.PcDto;
import com.houssem.pc.service.PcService;

@RestController
@RequestMapping("/api/pcs")
@AllArgsConstructor
public class PcController {
	private PcService pcService;
	 @GetMapping("{id}")
	 public ResponseEntity<APIResponseDto> getTeacherById(@PathVariable("id")
	Long id )
	 {
	 return new ResponseEntity<APIResponseDto>(
			 pcService.getPcById(id), HttpStatus.OK);
	 }
	}

