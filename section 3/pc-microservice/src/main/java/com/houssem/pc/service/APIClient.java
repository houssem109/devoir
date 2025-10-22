package com.houssem.pc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.houssem.pc.dto.MarqueDto;


@FeignClient(url = "http://localhost:8080", value = "MARQUE")
public interface APIClient {
 @GetMapping("api/marques/{marque-name}")
 MarqueDto getMarqueByName(@PathVariable("marque-name")
 String marqueName
 );
}