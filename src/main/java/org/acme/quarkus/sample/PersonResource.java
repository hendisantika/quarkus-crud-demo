package org.acme.quarkus.sample;

import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Path("/person")
public class PersonResource {

    static Set<String> persons = new HashSet<>();

    @POST
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response persist(@PathParam(value = "name") String name) {

        persons.add(name);

        return Response.ok(persons).build();
    }

    @PUT
    @Path("/{name}/{firstname}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response update(@PathParam(value = "name") String name, @PathParam(value = "firstname") String firstname) {

        Optional<String> first = persons.stream().filter(person -> person.equals(name)).findFirst();

        if (first.isPresent()) {
            persons.remove(name);
            persons.add(firstname);
            return Response.ok(persons).build();
        }

        return Response.status(Response.Status.NOT_FOUND).entity("person not found").build();
    }

    @DELETE
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response delete(@PathParam(value = "name") String name) {

        Optional<String> first = persons.stream().filter(person -> person.equals(name)).findFirst();

        if (first.isPresent()) {
            persons.remove(name);
            return Response.ok(persons).build();
        }

        return Response.status(Response.Status.NOT_FOUND).entity("person not found").build();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response findByName(@PathParam("name") String name) {

        Optional<String> first = persons.stream().filter(person -> person.equals(name)).findFirst();

        return first.isPresent() ? Response.ok(first.get()).build() : Response.status(Response.Status.NOT_FOUND).entity("person not found").build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response find(@Parameter(name = "name", required = false) @QueryParam("name") String name) {

        if (name != null && !name.isEmpty()) {
            return findByName(name);
        }

        return Response.ok(persons).build();
    }
}