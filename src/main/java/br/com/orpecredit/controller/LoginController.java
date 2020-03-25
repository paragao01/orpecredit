package br.com.orpecredit.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.orpecredit.entity.Usuario;
import br.com.orpecredit.service.LoginService;
import br.com.orpecredit.util.Formatador;
import br.com.orpecredit.util.exception.BusinessException;;

@Controller
@Scope("session")
public class LoginController implements Serializable {

	private static final long serialVersionUID = 3976008929036020063L;
	
	@Autowired
	@Qualifier("loginService")
	private LoginService loginService;

	private String modoTela = "login";

	private String login;
	private String senha;
	private String confirmarSenha;

	public void resetTela() {
		this.modoTela = "login";
		this.login = null;
		this.senha = null;
		this.confirmarSenha = null;
	}

	public String efetuarLogin() throws BusinessException {
		Usuario usuario = new Usuario();
		usuario.setLogin(Formatador.zeroLeft(this.login, 5));
		usuario.setSenha(this.senha);
				
		usuario = loginService.consultaLogin(usuario);
		//usuario.setRelacaoProduto("[48][53][24][1][60][47][40][55][52][71]");
		//usuario.setNome("Paulo Aragao");
		//usuario.setStatus("OK");
		if (usuario.getStatus().equals("OK")) {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			usuario.setIp((request.getRemoteAddr().equals("0:0:0:0:0:0:0:1")?"127.0.0.1":request.getRemoteAddr()));
			session.setAttribute("usuarioCorrente",	usuario);
			return "/index.jsf?faces-redirect=true";
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "O usuário e/ou senha não são válidos", null));
			return "/login.jsf";
		}
	}

	public String efetuarLogout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(true);
		session.setAttribute("usuarioCorrente", null);
		this.login = null;
		this.senha = null;
		return "login.jsf?faces-redirect=true";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

	public String getModoTela() {
		return modoTela;
	}

	public void setModoTela(String modoTela) {
		this.modoTela = modoTela;
	}

}
