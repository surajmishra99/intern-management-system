package com.internmanagementsystem.internmanagementsys.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task {

    @Id
    @Column(name = "task_id")
    private long task_id;

    @Column(name = "task_description")
    private String task_description;

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public Task() {
    }

    public Task(long task_id, String task_description) {
        this.task_id = task_id;
        this.task_description = task_description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_description='" + task_description + '\'' +
                '}';
    }
}