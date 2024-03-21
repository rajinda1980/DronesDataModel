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
    private Integer weight;

    @Column(name = "CODE")
    private String code;

    @Column(name = "IMAGE", columnDefinition = "LONGBLOB")
    private byte[] image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRONE")
    private Drone drone;
}
