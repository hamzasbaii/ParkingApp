package com.example.parking.Repository;

import com.example.parking.entites.Reservation;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
