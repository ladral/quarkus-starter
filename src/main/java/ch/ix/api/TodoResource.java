package ch.ix.api;

import ch.ix.models.TodoItem;
import ch.ix.services.TodoRestClient;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/todos")
public class TodoResource {

    @RestClient
    TodoRestClient todoRestClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TodoItem> getTodos() {
        try {
            return todoRestClient.getTodos().todos();

        } catch (Exception e) {
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
