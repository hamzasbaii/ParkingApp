package com.example.parking.entites;



import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long CIN;
    private Long Matricule;
    private Long Telephone;
    private String Login;
    private String PWD ;

    @OneToMany(mappedBy = "clientt" ,cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;

}
