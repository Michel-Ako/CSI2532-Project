package com.example.myhotel.model;

public class Room {
    private int roomNumber;
    private String roomType;
    private int price;
    private String capacity;
    private String view;
    private String extent;
    private String damage;
    private String amenities;
    private boolean availability;
    private String status;
    private int hotelID;
    private int clientID;
    private int employeeID;
    private boolean isRented;

    public Room(int roomNumber, String roomType, int price, String capacity, String view, String extent, String damage, String amenities, boolean availability, String status, int hotelID, int clientID, int employeeID, boolean isRented) {
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
        this.isRented = isRented;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public String getExtent() {
        return extent;
    }

    public void setExtent(String extent) {
        this.extent = extent;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public void setRented(boolean rented) {
        isRented = rented;

    }
}
