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
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
    private Boolean Full;
    private String Position ;

    @OneToMany(mappedBy = "parking" ,cascade = CascadeType.ALL)
    private Set<Place> places;


    @ManyToOne(cascade = CascadeType.ALL)
    private Admin Admin;

}
