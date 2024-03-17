package com.musala.drones.datamodel.repository;

import com.musala.drones.datamodel.data.Drone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneRepository extends JpaRepository<Drone, String> {
}
