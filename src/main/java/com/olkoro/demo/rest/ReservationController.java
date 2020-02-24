package com.olkoro.demo.rest;

import com.olkoro.demo.model.Reservation;
import com.olkoro.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {

    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/reservations/all")
    public List<Reservation> allReservations() {
        return reservationRepository.findAll();
    }

    @GetMapping("/reservations/{id}")
    public Reservation getReservation(@PathVariable Long id){
        return reservationRepository.getOne(id);
    }

    @PostMapping("/reservations/")
    public Reservation PostReservation(@RequestBody Reservation reservation){
        return reservationRepository.save(reservation);
    }

    @DeleteMapping ("/reservations/{id}")
    public void deleteOrder(@PathVariable Long id) {
        reservationRepository.delete(reservationRepository.getOne(id));
    }
}