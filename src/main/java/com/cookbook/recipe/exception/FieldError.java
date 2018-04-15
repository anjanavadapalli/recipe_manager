package com.cookbook.recipe.exception;

public class FieldError {
    private String field;

    private String error;

    public FieldError() {

    }

    public FieldError(final String field, final String error) {
        super();
        this.field = field;
        this.error = error;
    }

    public String getField() {
        return field;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

}
