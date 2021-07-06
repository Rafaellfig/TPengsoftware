package com.engsoft.tp1backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engsoft.tp1backend.repository.SecaoRepository;

@Service
public class SecaoService {

	@Autowired
	private SecaoRepository secaoRepository;
}
