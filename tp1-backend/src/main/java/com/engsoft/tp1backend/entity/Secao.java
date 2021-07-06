package com.engsoft.tp1backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "secao")
@Data
public class Secao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Column(name = "subtitulo", nullable = true)
	private String subtitulo;

	@Column(name = "texto", nullable = false)
	private String texto;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario_adm_autor", nullable = false)
	private UsuarioADM usuarioADMAutor;
}
