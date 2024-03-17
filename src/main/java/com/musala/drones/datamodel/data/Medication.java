package com.musala.drones.datamodel.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MEDICATION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medication {

    @Id
    @Column(name = "DID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    @Column(name = "NAME", length = 250)
    private String name;

    @Column(name = "WEIGHT")
    private Double weight;

    @Column(name = "CODE")
    private String code;

    @Lob
    @Column(name = "IMAGE")
    private byte[] image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRONE")
    private Drone drone;
}
