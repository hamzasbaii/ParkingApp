package com.example.parking.entites;


import com.fasterxml.jackson.annotation.JsonIgnore;
 import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Boolean Dispo;
    private String position ;
    private Float Prix ;



    @JsonIgnore
    @ManyToOne
    private Parking parking;

    @OneToOne
    private Place places;


}
