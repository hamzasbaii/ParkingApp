package com.example.parking.Repository;

 import com.example.parking.entites.Place;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepo extends JpaRepository<Place, Long> {
}
