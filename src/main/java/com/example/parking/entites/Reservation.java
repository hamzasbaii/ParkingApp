package com.example.parking.entites;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date DateE;
    private Date DateS;
    private Float PrixT;



    @JsonIgnore
    @ManyToOne
     private Client clientt;

    @OneToOne(mappedBy = "places")
    private Place places;
}
