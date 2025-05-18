package ch.ix.services;

import ch.ix.services.model.GetTodosResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "todo")
public interface TodoRestClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/api/todos")
    GetTodosResponse getTodos();
}
