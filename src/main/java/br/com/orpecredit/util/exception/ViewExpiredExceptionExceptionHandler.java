package br.com.orpecredit.util.exception;

import java.io.IOException;
import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.FactoryFinder;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;
import javax.faces.render.RenderKit;
import javax.faces.render.RenderKitFactory;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

public class ViewExpiredExceptionExceptionHandler extends
		ExceptionHandlerWrapper {

	private ExceptionHandler wrapped;

	public ViewExpiredExceptionExceptionHandler() {
	}

	public ViewExpiredExceptionExceptionHandler(ExceptionHandler wrapped) {
		this.wrapped = wrapped;
	}

	@Override
	public ExceptionHandler getWrapped() {
		return this.wrapped;
	}

	@Override
	public void handle() throws FacesException {
		String redirectPage = null;
		for (Iterator<ExceptionQueuedEvent> i = getUnhandledExceptionQueuedEvents()
				.iterator(); i.hasNext();) {
			ExceptionQueuedEvent event = i.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event
					.getSource();
			Throwable t = context.getException();
			if (t instanceof ViewExpiredException) {
				ViewExpiredException vee = (ViewExpiredException) t;

				RequestContext.getCurrentInstance().closeDialog(null);

				FacesContext fc = FacesContext.getCurrentInstance();
				HttpSession session = (HttpSession) fc.getExternalContext()
						.getSession(true);
				try {
					// Push some useful stuff to the request scope for use in
					// the page
					session.setAttribute("currentViewId", vee.getViewId());
					session.setAttribute("usuarioCorrente", null);
					// Para qual página será redirecionada caso a sessão expire,
					// no meu caso retorna à principal
					redirectPage = "/login.jsf";
				} finally {
					i.remove();
				}
				// Redireciona a página
				doRedirect(fc, redirectPage);
			}
		}

		// At this point, the queue will not contain any ViewExpiredEvents.
		// Therefore, let the parent handle them.
		getWrapped().handle();
	}

	public static void doRedirect(FacesContext fc, String redirectPage)
			throws FacesException {
		ExternalContext ec = fc.getExternalContext();

		try {

			ServletResponse response = (ServletResponse) ec.getResponse();
			ServletRequest request = (ServletRequest) ec.getRequest();
			response.setCharacterEncoding(request.getCharacterEncoding());

			RenderKitFactory factory = (RenderKitFactory) FactoryFinder
					.getFactory(FactoryFinder.RENDER_KIT_FACTORY);
			RenderKit renderKit = factory.getRenderKit(fc, fc.getApplication()
					.getViewHandler().calculateRenderKitId(fc));
			ResponseWriter responseWriter = renderKit.createResponseWriter(
					response.getWriter(), null, request.getCharacterEncoding());
			fc.setResponseWriter(responseWriter);

//			ec.redirect(ec.getRequestContextPath()
//					+ (redirectPage != null ? redirectPage : ""));
			ec.redirect(redirectPage);
		} catch (IOException e) {
			System.out.println("Redirect to the specified page '"
					+ redirectPage + "' failed");
			throw new FacesException(e);
		}
	}

}
