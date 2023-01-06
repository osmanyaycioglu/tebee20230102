package com.training.javaee.rest.error;

import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationErrorHandler implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(final ConstraintViolationException exceptionParam) {
        return Response.status(Status.BAD_REQUEST)
                       .header("errorTest",
                               "xyz")
                       .header("Content-Type",
                               MediaType.APPLICATION_JSON)
                       .entity(new ErrorObj().setErrorDesc("Validation error")
                                             .setErrorCode(1056)
                                             .setSubErrors(exceptionParam.getConstraintViolations()
                                                                         .stream()
                                                                         .map(cv -> new ErrorObj().setErrorCode(1057)
                                                                                                  .setErrorDesc(""
                                                                                                                + cv))
                                                                         .collect(Collectors.toList())))
                       .build();
    }

}
