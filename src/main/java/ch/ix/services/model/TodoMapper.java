package ch.ix.services.model;

import ch.ix.models.TodoItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface TodoMapper {

    @Mapping(target = "description", source = "todo")
    TodoItem map(GetTodosResponse.Todo todo);
}
