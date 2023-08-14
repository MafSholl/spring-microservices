package com.interswitch.services.task.models;


public class Task {

    private Long id;
    private String name;
    private Long assignedTo;

    public Task(String name, Long assignedTo) {
        this.name = name;
        this.assignedTo = assignedTo;
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

    public Long getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assginedTo='" + assignedTo + '\'' +
                '}';
    }
}
