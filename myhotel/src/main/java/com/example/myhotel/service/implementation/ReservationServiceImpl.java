package com.example.myhotel.service.implementation;

import com.example.myhotel.model.Reservation;
import com.example.myhotel.model.Room;
import com.example.myhotel.service.ReservationService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    private Connection connection;

    public ReservationServiceImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Reservation> getAllReservations() throws SQLException {
        List<Reservation> reservations = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Reservation");
            while (resultSet.next()) {
                Reservation reservation = new Reservation(
                        resultSet.getInt("ID_Reservation"),
                        resultSet.getTimestamp("Date_reservation"),
                        resultSet.getTimestamp("Date_debut"),
                        resultSet.getTimestamp("Date_fin"),
                        resultSet.getInt("Numero_chambre"),
                        resultSet.getInt("Numero_archive")
                );
                reservations.add(reservation);
            }
        }
        return reservations;
    }

    @Override
    public Reservation getReservationById(int reservationID) throws SQLException {
        Reservation reservation = null;
        String sql = "SELECT * FROM Reservation WHERE ID_Reservation=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservationID);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                reservation = new Reservation(
                        resultSet.getInt("ID_Reservation"),
                        resultSet.getTimestamp("Date_reservation"),
                        resultSet.getTimestamp("Date_debut"),
                        resultSet.getTimestamp("Date_fin"),
                        resultSet.getInt("Numero_chambre"),
                        resultSet.getInt("Numero_archive")
                );
            }
        }
        return reservation;
    }

    @Override
    public void addReservation(Reservation reservation) throws SQLException {
        String sql = "INSERT INTO Reservation (ID_Reservation, Date_reservation, Date_debut, Date_fin, Numero_chambre, Numero_archive) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservation.getReservationID());
            statement.setTimestamp(2, reservation.getReservationDate());
            statement.setTimestamp(3, reservation.getStartDate());
            statement.setTimestamp(4, reservation.getEndDate());
            statement.setInt(5, reservation.getRoomNumber());
            statement.setInt(6, reservation.getArchiveNumber());
            statement.executeUpdate();
        }
    }

    @Override
    public void updateReservation(Reservation reservation) throws SQLException {
        String sql = "UPDATE Reservation SET Date_reservation=?, Date_debut=?, Date_fin=?, Numero_chambre=?, Numero_archive=? WHERE ID_Reservation=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setTimestamp(1, reservation.getReservationDate());
            statement.setTimestamp(2, reservation.getStartDate());
            statement.setTimestamp(3, reservation.getEndDate());
            statement.setInt(4, reservation.getRoomNumber());
            statement.setInt(5, reservation.getArchiveNumber());
            statement.setInt(6, reservation.getReservationID());
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteReservation(int reservationID) throws SQLException {
        String sql = "DELETE FROM Reservation WHERE ID_Reservation=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservationID);
            statement.executeUpdate();
        }
    }
}

