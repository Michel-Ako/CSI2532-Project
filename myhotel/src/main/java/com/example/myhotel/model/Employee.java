package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Employee", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"SSN"})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_ID")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "SSN", nullable = false)
    private String ssn;

    @Column(name = "post", nullable = false)
    private String post;

    @ManyToOne
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    @NotBlank(message = "Hotel ID required")
    private Hotel hotel;

    public Employee(Long id, String name, String address, String ssn, String post, Hotel hotel) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.post = post;
        this.hotel = hotel;
    }

    public Employee() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn='" + ssn + '\'' +
                ", post='" + post + '\'' +
                ", hotel=" + hotel +
                '}';
    }
}


