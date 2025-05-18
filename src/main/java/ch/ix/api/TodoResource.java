package ch.ix.api;

import ch.ix.models.TodoItem;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/todos")
public class TodoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TodoItem> getTodos() {
        List<TodoItem> todoItems = new ArrayList<>();

        todoItems.add(new TodoItem(1, "Learn Quarkus", 1));
        todoItems.add(new TodoItem(2, "Learn MapStruct", 1));
        todoItems.add(new TodoItem(3, "Learn Quarkus", 2));

        return todoItems;
    }
}
