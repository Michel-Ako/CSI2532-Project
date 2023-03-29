package com.example.myhotel.service.implementation;

import com.example.myhotel.model.Reservation;
import com.example.myhotel.model.Room;
import com.example.myhotel.service.ReservationService;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {

    private List<Reservation> reservations = new ArrayList<>();

    @Override
    public List<Reservation> getAllReservations() {
        return reservations;
    }

    @Override
    public List<Reservation> getReservationsByGuest(String guestName) {
        List<Reservation> guestReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getGuestName().equals(guestName)) {
                guestReservations.add(reservation);
            }
        }
        return guestReservations;
    }

    @Override
    public List<Reservation> getReservationsByRoom(Room room) {
        List<Reservation> roomReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getRoom().equals(room)) {
                roomReservations.add(reservation);
            }
        }
        return roomReservations;
    }

    @Override
    public void makeReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public void cancelReservation(Reservation reservation) {
        reservation.setCancelled(true);
    }

    @Override
    public boolean isRoomAvailable(Room room, Reservation reservation) {
        for (Reservation res : reservations) {
            if (!res.isCancelled() && res.getRoom().equals(room)
                    && !(reservation.getCheckoutDate().isBefore(res.getCheckinDate())
                    || reservation.getCheckinDate().isAfter(res.getCheckoutDate()))) {
                return false;
            }
        }
        return true;
    }
}
