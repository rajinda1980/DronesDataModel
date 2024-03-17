package com.musala.drones.datamodel.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DRONE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Drone {

    @Id
    @Column(name = "SERIAL_NUMBER", nullable = false)
    private String serialNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MODEL", nullable = false)
    private Model model;

    @Column(name = "WEIGHT")
    private Double weight;

    @Column(name = "BATTERY_CAPACITY")
    private Double capacity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATE")
    private State state;
}
