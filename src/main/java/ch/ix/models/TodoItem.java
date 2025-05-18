package ch.ix.models;

public class TodoItem {
    private long id;
    private String todo;
    private boolean completed;
    private long userId;

    public TodoItem(long id, String todo, long userId) {
        this.id = id;
        this.todo = todo;
        this.userId = userId;
        this.completed = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
