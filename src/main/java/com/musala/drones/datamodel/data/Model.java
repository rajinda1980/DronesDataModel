package com.musala.drones.datamodel.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MODEL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    @Id
    @Column(name = "DID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    @Column(name = "CATEGORY", nullable = false, length = 25)
    private String category;
}
