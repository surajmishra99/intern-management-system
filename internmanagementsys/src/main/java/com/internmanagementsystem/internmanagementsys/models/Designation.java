package com.internmanagementsystem.internmanagementsys.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "designation")
public class Designation {

    @Id
    @Column(name = "designation_id")
    private long designation_id;

    @Column(name = "designated_as")
    private String designated_as;

    public long getDesignation_id() {
        return designation_id;
    }

    public void setDesignation_id(Long designation_id) {
        this.designation_id = designation_id;
    }

    public String getDesignated_as() {
        return designated_as;
    }

    public void setDesignated_as(String designated_as) {
        this.designated_as = designated_as;
    }

    public Designation() {
    }

    public Designation(long designation_id, String designated_as) {
        this.designation_id = designation_id;
        this.designated_as = designated_as;
    }

    @Override
    public String toString() {
        return "Designation{" +
                "designation_id=" + designation_id +
                ", designated_as='" + designated_as + '\'' +
                '}';
    }
}
