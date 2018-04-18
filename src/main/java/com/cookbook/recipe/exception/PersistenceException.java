package com.cookbook.recipe.exception;

public class PersistenceException extends Exception {

    private static final long serialVersionUID = 6390494942485727457L;

    public PersistenceException() {
        super();
    }

    public PersistenceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(final String message) {
        super(message);
    }

}
