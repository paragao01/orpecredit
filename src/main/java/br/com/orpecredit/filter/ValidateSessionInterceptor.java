package br.com.orpecredit.filter;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import br.com.orpecredit.entity.Usuario;;

@Component
public class ValidateSessionInterceptor implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2146508407831235132L;

	@Override
	public void afterPhase(PhaseEvent event) {
	}

	@Override
	public void beforePhase(PhaseEvent event) {

		if ("/login.xhtml".equals(FacesContext.getCurrentInstance()
				.getViewRoot().getViewId())) {
			return;
		}

		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(true);
		validaUsuarioSessao(session);
	}

	protected void validaUsuarioSessao(HttpSession session) {
		Usuario usuarioCorrente = (Usuario) session
				.getAttribute("usuarioCorrente");
		if (usuarioCorrente == null) {
			FacesContext
					.getCurrentInstance()
					.getApplication()
					.getNavigationHandler()
					.handleNavigation(FacesContext.getCurrentInstance(), null,
							"/login.jsf?faces-redirect=true");
			FacesContext.getCurrentInstance().renderResponse();
		}
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;
	}
}
