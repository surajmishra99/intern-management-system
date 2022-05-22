package com.internmanagementsystem.internmanagementsys.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TaskAllotment")
public class TaskAllotment {

    @Id
    @Column(name = "task_allot_id")
    private long task_allot_id;

    @Column(name = "ranking")
    private int ranking;

    @Column(name = "feedback")
    private String feedback;

    @Column(name = "status")
    private String status;

    @Column(name = "start_date")
    private int start_date;

    @Column(name = "end_date")
    private int end_date;

    public long getTask_allot_id() {
        return task_allot_id;
    }

    public void setTask_allot_id(long task_allot_id) {
        this.task_allot_id = task_allot_id;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStart_date() {
        return start_date;
    }

    public void setStart_date(int start_date) {
        this.start_date = start_date;
    }

    public int getEnd_date() {
        return end_date;
    }

    public void setEnd_date(int end_date) {
        this.end_date = end_date;
    }

    public TaskAllotment() {
    }

    public TaskAllotment(long task_allot_id, int ranking, String feedback, String status, int start_date, int end_date) {
        this.task_allot_id = task_allot_id;
        this.ranking = ranking;
        this.feedback = feedback;
        this.status = status;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "TaskAllotment{" +
                "task_allot_id=" + task_allot_id +
                ", ranking=" + ranking +
                ", feedback='" + feedback + '\'' +
                ", status='" + status + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }

}
