package com.example.myhotel.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Clients", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"SSN"})
})
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_ID", nullable = false)
    private Long ID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "SSN", nullable = false)
    private int SSN;

    @Column(name = "Payment", nullable = false)
    private String payment;

    @Column(name = "Checkin", nullable = false)
    private LocalDate checkin;

    @ManyToOne(targetEntity = Hotel.class)
    @JoinColumn(name = "hotel_ID", referencedColumnName = "hotel_ID")
    @NotBlank(message = "Hotel ID required")
    private Hotel ID_Hotel;

    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "employee_ID", referencedColumnName = "employee_ID")
    @NotBlank(message = "Employee ID required")
    private Employee ID_employee;

    public Clients(Long ID, String name, String address, int SSN, String payment, LocalDate checkin, Hotel ID_Hotel, Employee ID_employee) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.payment = payment;
        this.checkin = checkin;
        this.ID_Hotel = ID_Hotel;
        this.ID_employee = ID_employee;
    }

    public Clients() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public Hotel getID_Hotel() {
        return ID_Hotel;
    }

    public void setID_Hotel(Hotel ID_Hotel) {
        this.ID_Hotel = ID_Hotel;
    }

    public Employee getID_employee() {
        return ID_employee;
    }

    public void setID_employee(Employee ID_employee) {
        this.ID_employee = ID_employee;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Clients{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", payment='" + payment + '\'' +
                ", checkin=" + checkin +
                ", ID_Hotel=" + ID_Hotel +
                ", ID_employee=" + ID_employee +
                '}';
    }
}


