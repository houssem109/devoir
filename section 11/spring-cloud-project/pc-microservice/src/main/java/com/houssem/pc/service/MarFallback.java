package com.houssem.pc.service;

import org.springframework.stereotype.Component;

import com.houssem.pc.dto.MarqueDto;

@Component
public class MarFallback  implements APIClient {
		 @Override
		 public MarqueDto getMarqueByName(String marqueName) {
		 return null;
		 }

}
