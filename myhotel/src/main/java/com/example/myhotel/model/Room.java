package com.example.myhotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Room")
public class Room {
    @Id
    @Column(name = "roomNumber", nullable = false)
    private int roomNumber;

    @Column(name = "RoomType", nullable = false)
    private String roomType;

    @Column(name = "Price", nullable = false)
    private double price;

    @Column(name = "Capacity", nullable = false)
    private String capacity;

    @Column(name = "View", nullable = false)
    private String view;

    @Column(name = "Extent", nullable = false)
    private boolean extent;

    @Column(name = "Damage", nullable = false)
    private String damage;

    @Column(name = "Amenities", nullable = false)
    private String amenities;

    @Column(name = "Availability", nullable = false)
    private boolean availability;

    @Column(name = "Status", nullable = false)
    private String status;

    @ManyToOne(targetEntity = Hotel.class)
    @JoinColumn(name = "hotel_ID", referencedColumnName = "hotel_ID")
    @NotBlank(message = "Hotel ID required")
    private Hotel hotelID;

    @ManyToOne(targetEntity = Clients.class)
    @JoinColumn(name = "client_ID", referencedColumnName = "client_ID")
    @NotBlank(message = "Client ID required")
    private Clients clientID;

    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "employee_ID", referencedColumnName = "employee_ID")
    @NotBlank(message = "Employee ID required")
    private Employee employeeID;


    public Room() {
    }

    public Room(int roomNumber, String roomType, double price, String capacity, String view, boolean extent, String damage, String amenities, boolean availability, String status, Hotel hotelID, Clients clientID, Employee employeeID) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.capacity = capacity;
        this.view = view;
        this.extent = extent;
        this.damage = damage;
        this.amenities = amenities;
        this.availability = availability;
        this.status = status;
        this.hotelID = hotelID;
        this.clientID = clientID;
        this.employeeID = employeeID;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public boolean getExtent() {
        return extent;
    }

    public void setExtent(boolean extent) {
        this.extent = extent;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", capacity='" + capacity + '\'' +
                ", view='" + view + '\'' +
                ", extent='" + extent + '\'' +
                ", damage='" + damage + '\'' +
                ", amenities='" + amenities + '\'' +
                ", availability=" + availability +
                ", status='" + status + '\'' +
                ", hotelID=" + hotelID +
                ", clientID=" + clientID +
                ", employeeID=" + employeeID +
                '}';
    }
}