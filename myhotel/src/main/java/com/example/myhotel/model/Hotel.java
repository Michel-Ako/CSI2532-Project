package com.example.myhotel.model;

import javax.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id", nullable = false)
    private Long hotelID;

    @Column(name = "gestionnaire_id")
    private Long gestionnaireID;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private int rating;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "no_rooms")
    private Integer noRooms;

    @ManyToOne
    @JoinColumn(name = "chain_id", referencedColumnName = "chain_id")
    private Chain chain;

    public Hotel() {}

    public Hotel(Long gestionnaireID, String name, int rating, String address, String phone, String email, Integer noRooms, Chain chain) {
        this.gestionnaireID = gestionnaireID;
        this.name = name;
        this.rating = rating;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.noRooms = noRooms;
        this.chain = chain;
    }

    public Long getHotelID() {
        return hotelID;
    }

    public void setHotelID(Long hotelID) {
        this.hotelID = hotelID;
    }

    public Long getGestionnaireID() {
        return gestionnaireID;
    }

    public void setGestionnaireID(Long gestionnaireID) {
        this.gestionnaireID = gestionnaireID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(Integer noRooms) {
        this.noRooms = noRooms;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Hotel{" +
                "hotelID=" + hotelID +
                ", gestionnaireID=" + gestionnaireID +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", noRooms=" + noRooms +
                ", chain=" + chain +
                '}';
    }
}

/* // add a room to the hotel
    public void addRoom(Room room) {
        Reservedrooms.add(room);
    }

    // remove a room from the hotel
    public void removeRoom(Room room) {
        Reservedrooms.remove(room);
    }

    // make a reservation for a room
    public void makeReservation(Reservation reservation) {
        if (rooms.size()< noRooms){
            reservation.getRoom().setBooked(true);
            reservations.add(reservation);
        }

    }


    // cancel a reservation for a room
    public void cancelReservation(Reservation reservation) {
        reservation.getRoom().setBooked(false);
        reservations.remove(reservation);
    }*/
}