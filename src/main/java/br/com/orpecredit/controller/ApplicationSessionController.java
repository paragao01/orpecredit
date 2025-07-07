package main.java.br.com.orpecredit.controller;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.orpecredit.entity.Usuario;
import br.com.orpecredit.util.Util;

@Controller
@Scope("session")
public class ApplicationSessionController implements Serializable {

	private static final long serialVersionUID = -1370082609980778027L;

	public Usuario getUsuarioSessao() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		return (Usuario) session.getAttribute("usuarioCorrente");
	}

	public void logout() {
		FacesContext.getCurrentInstance()
				.getApplication()
				.getNavigationHandler()
				.handleNavigation(FacesContext.getCurrentInstance(), null,
				"/login.jsf?faces-redirect=true");
		FacesContext.getCurrentInstance().renderResponse();
	}

	public Boolean getServico(String opcao) {
		Usuario us = getUsuarioSessao();
		if (us != null) {
			if(Util.strstr(us.getRelacaoProduto(), opcao)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}
