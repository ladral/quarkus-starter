package ch.ix.services.model;

import ch.ix.models.TodoItem;

import java.util.List;

public record GetTodosResponse(
        List<TodoItem> todos,
        int total,
        int skip,
        int limit
) {
}
