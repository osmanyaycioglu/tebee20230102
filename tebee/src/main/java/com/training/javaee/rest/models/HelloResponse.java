package com.training.javaee.rest.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloResponse {

    private String  result;
    private String  zipCode;
    private String  extra;
    private Integer cause;

    public HelloResponse() {
    }

    public HelloResponse(final String resultParam,
                         final String zipCodeParam,
                         final String extraParam,
                         final Integer causeParam) {
        super();
        this.result = resultParam;
        this.zipCode = zipCodeParam;
        this.extra = extraParam;
        this.cause = causeParam;
    }

    public String getResult() {
        return this.result;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getExtra() {
        return this.extra;
    }

    public Integer getCause() {
        return this.cause;
    }

    public void setResult(final String resultParam) {
        this.result = resultParam;
    }

    public void setZipCode(final String zipCodeParam) {
        this.zipCode = zipCodeParam;
    }

    public void setExtra(final String extraParam) {
        this.extra = extraParam;
    }

    public void setCause(final Integer causeParam) {
        this.cause = causeParam;
    }

}
