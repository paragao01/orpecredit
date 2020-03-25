package br.com.orpecredit.util.exception;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

import br.com.orpecredit.util.exception.ViewExpiredExceptionExceptionHandler;

public class ViewExpiredExceptionExceptionHandlerFactory extends
		ExceptionHandlerFactory {

	private ExceptionHandlerFactory parent;

	public ViewExpiredExceptionExceptionHandlerFactory(
			ExceptionHandlerFactory parent) {
		this.parent = parent;
	}

	@Override
	public ExceptionHandler getExceptionHandler() {
		ExceptionHandler result = parent.getExceptionHandler();
		result = new ViewExpiredExceptionExceptionHandler(result);
		return result;
	}

}
