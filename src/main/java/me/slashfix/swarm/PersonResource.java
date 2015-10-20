package me.slashfix.swarm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import me.slashfix.swarm.domain.Person;

/**
 * @author arungupta
 */
@Path("person")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {
    
    @PersistenceContext
    EntityManager em;
    
    public String get() {
        return "hello swarm!";
    }
    
    @GET
    @Path("list")
    public Object[] getAll() {
        return em.createNamedQuery("Person.findAll", Person.class).getResultList().toArray();
    }
}
