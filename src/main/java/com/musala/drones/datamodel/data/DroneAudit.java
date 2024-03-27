package com.musala.drones.datamodel.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "DRONE_AUDIT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DroneAudit {

    @Id
    @Column(name = "DID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "SERIAL_NUMBER", nullable = false)
    private String serialNumber;

    @Column(name = "BATTERY_LEVEL", nullable = false)
    private Integer batteryLevel;

    @Column(name = "CHECK_TIME", nullable = false)
    private LocalDateTime checkTime;

    public DroneAudit(String id, String serialNumber, Integer batteryLevel, LocalDateTime checkTime) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.batteryLevel = batteryLevel;
        this.checkTime = checkTime;
    }
}
