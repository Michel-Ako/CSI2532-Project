package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Chain")
public class Chain {

    @Id
    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private String number;

    @Column(name = "noHotels")
    private int noHotels;

    public Chain(String name, String address, String email, String number, int noHotels) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.number = number;
        this.noHotels = noHotels;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNoHotels() {
        return noHotels;
    }

    public void setNoHotels(int noHotels) {
        this.noHotels = noHotels;
    }

    @Override
    public String toString() {
        return "Chain{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", noHotels=" + noHotels +
                '}';
    }
}

