package com.example.myhotel.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Reservation_ID", nullable = false)
    private int reservationID;

    @Column(name = "Reservation_Date")
    private Timestamp reservationDate;

    @Column(name = "Start_Date")
    private Timestamp startDate;

    @Column(name = "End_Date")
    private Timestamp endDate;

    @Column(name = "Room_Number")
    private int roomNumber;

    @ManyToOne(targetEntity = Archive.class)
    @JoinColumn(name = "NumeroArchives", referencedColumnName = "NumeroArchives")
    private Archive archive;

    @ManyToOne(targetEntity = Client.class)
    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID")
    private Client client;

    public Reservation() {}

    public Reservation(Timestamp startDate, Timestamp endDate, int roomNumber, Archive archive, Client client) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomNumber = roomNumber;
        this.archive = archive;
        this.client = client;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public Timestamp getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Timestamp reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @PrePersist
    public void prePersist(){
        this.reservationDate = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservationID=" + reservationID + ", reservationDate=" + reservationDate
                + ", startDate=" + startDate + ", endDate=" + endDate + ", roomNumber=" + roomNumber
                + ", archive=" + archive + ", client=" + client + '}';
    }
}
