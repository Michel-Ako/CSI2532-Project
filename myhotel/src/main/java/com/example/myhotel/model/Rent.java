package com.example.myhotel.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Rent")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rent_ID", nullable = false)
    private Long ID;

    @Column(name = "RentDate", nullable = false)
    private LocalDate rentdate;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startrent;

    @Column(name = "EndDate", nullable = false)
    private LocalDate enddate;

    @Column(name = "noRoom", nullable = false)
    private String noRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_ID", referencedColumnName = "client_ID")
    @NotBlank(message = "Client ID required")
    private Client ID_customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NumeroArchives", referencedColumnName = "NumeroArchives")
    @NotBlank(message = "Archives number required")
    private Archives noArchives;

    public Rent() {
    }

    public Rent(LocalDate rentdate, LocalDate startrent, LocalDate enddate, String noRoom, Client ID_customer, Archives noArchives) {
        this.rentdate = rentdate;
        this.startrent = startrent;
        this.enddate = enddate;
        this.noRoom = noRoom;
        this.ID_customer = ID_customer;
        this.noArchives = noArchives;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public LocalDate getRentdate() {
        return rentdate;
    }

    public void setRentdate(LocalDate rentdate) {
        this.rentdate = rentdate;
    }

    public LocalDate getStartrent() {
        return startrent;
    }

    public void setStartrent(LocalDate startrent) {
        this.startrent = startrent;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public String getNoRoom() {
        return noRoom;
    }

    public void setNoRoom(String noRoom) {
        this.noRoom = noRoom;
    }

    public Client getID_customer() {
        return ID_customer;
    }

    public void setID_customer(Client ID_customer) {
        this.ID_customer = ID_customer;
    }

    public Archives getNoArchives() {
        return noArchives;
    }

    public void setNoArchives(Archives noArchives) {
        this.noArchives = noArchives;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "ID='" + ID + '\'' +
                ", rentdate=" + rentdate +
                ", startrent=" + startrent +
                ", enddate=" + enddate +
                ", noRoom='" + noRoom + '\'' +
                ", ID_customer=" + ID_customer +
                ", noArchives=" + noArchives +
                '}';
    }
}

