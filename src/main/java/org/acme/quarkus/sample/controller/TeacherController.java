package org.acme.quarkus.sample.controller;

import org.acme.quarkus.sample.entity.Teacher;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : crud-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/12/19
 * Time: 12.54
 */

@Path("/teacher")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class TeacherController {

    @Inject
    private EntityManager entityManager;


    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveData(@RequestBody @Valid Teacher teacher) {
        if (teacher.getId() == null) {
            throw new WebApplicationException("Id was invalidly set on request.", 422);
        }
        System.out.println("UUID : " + teacher.getId());
        entityManager.persist(teacher);
        return Response.ok(teacher).status(201).build();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Teacher> findAll() {
        return entityManager.createQuery("Select t from  Teacher t").getResultList();
    }

    @GET
    @Path("/all2")
    public List<Teacher> findAllTeachersWithCriteriaQuery() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Teacher> cq = cb.createQuery(Teacher.class);
        Root<Teacher> rootEntry = cq.from(Teacher.class);
        CriteriaQuery<Teacher> all = cq.select(rootEntry);

        TypedQuery<Teacher> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }
}
