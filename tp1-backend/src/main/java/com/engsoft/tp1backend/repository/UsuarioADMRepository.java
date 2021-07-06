package com.engsoft.tp1backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.engsoft.tp1backend.entity.UsuarioADM;

public interface UsuarioADMRepository extends JpaRepository<UsuarioADM, Long> {

	@Query("from UsuarioADM usuADM where usuADM.login = :login")
	List<UsuarioADM> listarPorLogin(@Param("login") String login);
}
