package com.training.javaee.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.javaee.ejb.HelloStateful;
import com.training.javaee.ejb.HelloStateless;
import com.training.javaee.rest.models.HelloResponse;
import com.training.javaee.rest.models.Kisi;
import com.training.javaee.rest.models.PersonRest;

@RequestScoped
@Path("/greeting")
@Produces("application/json")
@Consumes("application/json")
public class HelloRest {

    @EJB
    // @Inject
    private HelloStateless helloStateless;

    @EJB
    private HelloStateful  helloStateful;

    @Path("/hellostateless")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloStateless(@QueryParam("isim") final String name,
                                 @QueryParam("soy") final String surname) {
        String helloStringLoc = "";
        helloStringLoc += this.helloStateless.hello(name,
                                                    surname)
                          + " -- ";
        helloStringLoc += this.helloStateless.goodbye(name,
                                                      surname)
                          + " -- ";
        helloStringLoc += this.helloStateless.hello(name,
                                                    surname)
                          + " -- ";
        return helloStringLoc;
    }

    @Path("/hellostateful")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloStateful(@QueryParam("isim") final String name,
                                @QueryParam("soy") final String surname) {
        String helloStringLoc = "";
        helloStringLoc += this.helloStateless.hello(name,
                                                    surname)
                          + " -- ";
        helloStringLoc += this.helloStateless.goodbye(name,
                                                      surname)
                          + " -- ";
        helloStringLoc += this.helloStateless.hello(name,
                                                    surname)
                          + " -- ";
        return helloStringLoc;
    }

    // /tebee/rest/greeting/hello1 -> GET
    @Path("/hello1")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from rest application";
    }

    // /tebee/rest/greeting/hello1 -> PUT
    @Path("/hello1")
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return "Hello 2 PUT from rest application";
    }

    // /tebee/rest/greeting/hello1 -> PUT
    @Path("/hello1")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello3() {
        return "Hello 3 POST from rest application";
    }

    // /tebee/rest/greeting/hello2/1111 -> GET
    @Path("/hello2/{abc}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2(@PathParam("abc") final String name) {
        return "Hello 2 " + name;
    }

    @Path("/hello3/{abc}/soy/{xyz}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello3(@PathParam("abc") final String name,
                         @PathParam("xyz") final String surname) {
        return "Hello 3 " + name + " " + surname;
    }

    // /tebee/rest/greeting/hello4?isim=osman -> GET
    @Path("/hello4")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello4(@QueryParam("isim") final String name) {
        return "Hello 4 " + name;
    }

    // /tebee/rest/greeting/hello5?isim=osman&soy=yaycıoğlu -> GET
    @Path("/hello5")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello5(@QueryParam("isim") final String name,
                         @QueryParam("soy") final String surname) {
        return "Hello 5 " + name + " " + surname;
    }

    // /tebee/rest/greeting/hello6/osman?soy=yaycıoğlu -> GET
    @Path("/hello6/{isim}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello6(@PathParam("isim") final String name,
                         @QueryParam("soy") final String surname) {
        return "Hello 6 " + name + " " + surname;
    }

    @Path("/hello7")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello7(@MatrixParam("isim") final String name,
                         @MatrixParam("soy") final String surname) {
        return "Hello 7 " + name + " " + surname;
    }

    @Path("/hello8/{xyz}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello8(@PathParam("xyz") final Double avg,
                         @QueryParam("abc") final Integer counter) {
        return "Hello 8 " + avg + " : " + counter;
    }

    @Path("/hello9")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello9(final PersonRest personRestParam) {
        return "Hello 9 " + personRestParam;
    }

    @Path("/hello10")
    @PUT
    public HelloResponse hello10(final PersonRest personRestParam) {
        return new HelloResponse("abc",
                                 "xyz",
                                 "note",
                                 1000);
    }

    @Produces({
                "application/json",
                "application/xml"
    })
    @Consumes({
                "application/json",
                "application/xml"
    })
    @Path("/hello11")
    @PATCH
    public PersonRest hello11(final PersonRest personRestParam) {
        personRestParam.setName("ali");
        return personRestParam;
    }

    @Path("/hello12")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String hello12(@FormParam("isim") final String name,
                          @FormParam("soy") final String surname) {
        return "Hello 12 " + name + " " + surname;
    }

    @Path("/hello13/{h}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello13(@BeanParam final Kisi kisiParam) {
        return "Hello 13 " + kisiParam;
    }

    @Path("/hello14")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello14(@HeaderParam("isim") final String name,
                          @HeaderParam("soy") final String surname) {
        return "Hello 14 " + name + " " + surname;
    }

}
