package io.katharsis.resource.mock.models;

import io.katharsis.resource.annotations.*;

import java.util.ArrayList;
import java.util.List;

@JsonApiResource(type = "eager-projects")
public class ProjectEager {

    @JsonApiId
    private Long id;

    private String name;

    @JsonApiToOne
    private Task task;

    @JsonApiToMany
    @JsonApiIncludeByDefault
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
