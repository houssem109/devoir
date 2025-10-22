package com.houssem.pc.service;

import com.houssem.pc.dto.APIResponseDto;
import com.houssem.pc.dto.PcDto;

public interface PcService {
	APIResponseDto getPcById(Long id);
}
