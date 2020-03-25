package br.com.orpecredit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.orpecredit.entity.Usuario;
import br.com.orpecredit.repository.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;

	@Override
	public Usuario consultaLogin(Usuario usu) {
		if (usu == null) {
			throw new IllegalArgumentException();
		}		
		return (Usuario) this.loginDAO.consultaLogin(usu);		
	}
}
