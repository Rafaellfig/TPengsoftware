package com.engsoft.tp1backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.engsoft.tp1backend.entity.UsuarioADM;
import com.engsoft.tp1backend.service.UsuarioADMService;

@CrossOrigin
@RestController
@RequestMapping("/usuarioADM")
public class UsuarioADMController {

	@Autowired
	private UsuarioADMService usuarioADMService;

	@PostMapping(path = "/inserirUsuarioADM")
	public ResponseEntity<UsuarioADM> inserirUsuarioADM(@RequestBody(required = false) UsuarioADM usuarioADM) throws Exception {
		return new ResponseEntity<UsuarioADM>(this.usuarioADMService.inserirUsuarioADM(usuarioADM), HttpStatus.OK);
	}

	@GetMapping(path = "/fazerLogin")
	public ResponseEntity<String> fazerLogin(@RequestParam(name = "login", required = false) String login, @RequestParam(name = "senha", required = false) String senha) throws Exception {
		return new ResponseEntity<String>(this.usuarioADMService.fazerLogin(login, senha), HttpStatus.OK);
	}
}
