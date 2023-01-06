package com.training.javaee.rest.error;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GeneralErrorHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(final Exception exceptionParam) {
        if (exceptionParam instanceof NullPointerException) {
            return Response.status(Status.EXPECTATION_FAILED)
                           .header("errorTest",
                                   "xyz")
                           .header("Content-Type",
                                   MediaType.APPLICATION_JSON)

                           .entity(new ErrorObj().setErrorDesc(exceptionParam.getMessage())
                                                 .setErrorCode(5000))
                           .build();

        }
        return Response.status(Status.INTERNAL_SERVER_ERROR)
                       .header("errorTest",
                               "xyz")
                       .header("Content-Type",
                               MediaType.APPLICATION_JSON)
                       .entity(new ErrorObj().setErrorDesc(exceptionParam.getMessage())
                                             .setErrorCode(5000))
                       .build();
    }

}
