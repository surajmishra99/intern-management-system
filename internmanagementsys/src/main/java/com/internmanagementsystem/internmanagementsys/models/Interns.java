package com.internmanagementsystem.internmanagementsys.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interns")
public class Interns {



    @Id
    @Column(name = "intern_id")
    private long intern_id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact")
    private int contact;

    @Column(name = "address")
    private String address;

    @Column(name = "postal_code")
    private int postal_code;

    @Column(name = "start_date")
    private int start_date;

    @Column(name = "end_date")
    private int end_date;

    @Column(name = "status")
    private String status;

    public long getIntern_id() {
        return intern_id;
    }

    public void setIntern_id(long intern_id) {
        this.intern_id = intern_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Interns() {
    }

    public Interns(long intern_id, String name, int contact, String address, int postal_code, int start_date, int end_date, String status) {
        this.intern_id = intern_id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.postal_code = postal_code;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Interns{" +
                "intern_id=" + intern_id +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", address='" + address + '\'' +
                ", postal_code=" + postal_code +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", status='" + status + '\'' +
                '}';
    }
}
