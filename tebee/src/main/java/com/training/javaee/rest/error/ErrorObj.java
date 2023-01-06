package com.training.javaee.rest.error;

import java.util.List;

public class ErrorObj {

    private String         errorDesc;
    private Integer        errorCode;
    private List<ErrorObj> subErrors;

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ErrorObj setErrorDesc(final String errorDescParam) {
        this.errorDesc = errorDescParam;
        return this;
    }

    public ErrorObj setErrorCode(final Integer errorCodeParam) {
        this.errorCode = errorCodeParam;
        return this;
    }

    public List<ErrorObj> getSubErrors() {
        return this.subErrors;
    }

    public ErrorObj setSubErrors(final List<ErrorObj> subErrorsParam) {
        this.subErrors = subErrorsParam;
        return this;
    }

}
