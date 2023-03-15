package com.mnemonics.service;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.mnemonics.dto.MnemonicsDto;

public interface MnemonicsService {

	ResponseEntity<Object> createMnemonics() throws IOException;

}
