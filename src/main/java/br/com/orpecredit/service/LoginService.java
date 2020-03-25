package br.com.orpecredit.service;

import org.springframework.transaction.annotation.Transactional;

import br.com.orpecredit.entity.Usuario;

public interface LoginService {

	@Transactional(readOnly = true)
	Usuario consultaLogin(Usuario usu);
	
}
