package ch.ix.models;

public class TodoItem {
    private long id;
    private String description;
    private boolean completed;

    public TodoItem(long id, String todo) {
        this.id = id;
        this.description = todo;
        this.completed = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
