package com.engsoft.tp1backend.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "usuario_adm")
@Data
public class UsuarioADM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "login", nullable = false)
	private String login;

	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "nome", nullable = false)
	private String nome;

	@JsonIgnore
	@OneToMany(mappedBy = "usuarioADMAutor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Secao> secoes;
}
