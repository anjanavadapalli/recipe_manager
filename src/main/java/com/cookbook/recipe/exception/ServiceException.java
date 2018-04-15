package com.cookbook.recipe.exception;

public class ServiceException extends Exception {

    private static final long serialVersionUID = 4469142377508634097L;

    public ServiceException() {
        super();
    }

    public ServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ServiceException(final String message) {
        super(message);
    }

}
