package com.cookbook.recipe.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends Exception {

    private static final long serialVersionUID = 4679092470694098460L;

    private String message;

    private List<FieldError> errors = new ArrayList<>();

    public ValidationException() {

    }

    public ValidationException(final String message, final List<FieldError> errors) {
        super();
        this.message = message;
        this.errors = errors;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public List<FieldError> getErrors() {
        return errors;
    }

}
