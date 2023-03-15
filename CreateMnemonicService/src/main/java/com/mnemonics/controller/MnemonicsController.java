package com.mnemonics.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mnemonics.dto.MnemonicsDto;
import com.mnemonics.service.MnemonicsService;

import io.swagger.annotations.ApiOperation;

@RestController
public class MnemonicsController {
	
	@Autowired
	private MnemonicsService mnemonicsService;
	
	@ApiOperation(value = "API to generate mnemonics")
	@GetMapping("/createMnemonics")
	public ResponseEntity<Object> createMnemonics() throws IOException
	{
		return mnemonicsService.createMnemonics();
	}

}
