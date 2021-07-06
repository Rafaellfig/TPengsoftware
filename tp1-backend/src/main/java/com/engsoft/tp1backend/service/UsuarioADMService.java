package com.engsoft.tp1backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engsoft.tp1backend.entity.UsuarioADM;
import com.engsoft.tp1backend.exception.EngSoftException;
import com.engsoft.tp1backend.repository.UsuarioADMRepository;

@Service
public class UsuarioADMService {

	@Autowired
	private UsuarioADMRepository usuarioADMRepository;

	public UsuarioADM inserirUsuarioADM(UsuarioADM usuarioADM) throws Exception {
		if (usuarioADM == null) {
			throw new EngSoftException("Erro ao ler dados do Usuário ADM");
		}

		if (usuarioADM.getNome() == null || usuarioADM.getNome().isEmpty()) {
			throw new EngSoftException("Nome não pode ser vazio");
		}

		if (usuarioADM.getLogin() == null || usuarioADM.getLogin().isEmpty()) {
			throw new EngSoftException("Login não pode ser vazio");
		}

		if (usuarioADM.getSenha() == null || usuarioADM.getSenha().isEmpty()) {
			throw new Exception("Senha não pode ser vazia");
		}

		return this.usuarioADMRepository.save(usuarioADM);
	}

	public String fazerLogin(String login, String senha) throws Exception {
		if (login == null || login.isEmpty()) {
			throw new EngSoftException("Login não pode ser vazio");
		}

		if (senha == null || senha.isEmpty()) {
			throw new EngSoftException("Senha não pode ser vazia");
		}

		List<UsuarioADM> usuADMPorLogin = this.usuarioADMRepository.listarPorLogin(login);

		if (usuADMPorLogin == null || usuADMPorLogin.isEmpty()) {
			throw new EngSoftException("Nenhum usuário encontrado para o login " + login);
		} else if (usuADMPorLogin.size() > 1) {
			throw new EngSoftException("Mais de um usuário encontrado para o login " + login);
		}

		if (!senha.equals(usuADMPorLogin.get(0).getSenha())) {
			throw new EngSoftException("Senha incorreta");
		}

		return "OK";
	}
}
