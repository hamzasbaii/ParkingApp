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
public class Admin {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom;
    private  String Prenom;
    private String Login;
    private String PWD ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Parking> parkings;






}
