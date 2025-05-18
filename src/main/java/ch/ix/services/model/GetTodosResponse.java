package ch.ix.services.model;
import java.util.List;

public record GetTodosResponse(
        List<Todo> todos,
        int total,
        int skip,
        int limit
) {
    public record Todo(
            long id,
            String todo,
            boolean completed,
            long userId
    ) {
    }
}
