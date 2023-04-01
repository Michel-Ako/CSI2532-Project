package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Archive", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"archives_ID"})
public class Archives {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NumeroArchives", nullable = false)
    private int noArchive;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "archives_ID", nullable = false)
    private int ID;

    public Archives() {
    }

    public Archives(int noArchive, String type, int ID) {
        this.noArchive = noArchive;
        this.type = type;
        this.ID = ID;
    }

    public int getNoArchive() {
        return noArchive;
    }

    public void setNoArchive(int noArchive) {
        this.noArchive = noArchive;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Archives{" +
                "noArchive='" + noArchive + '\'' +
                ", type='" + type + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}

