package com.musala.drones.datamodel.repository;

import com.musala.drones.datamodel.data.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {

    @Query("FROM Medication med WHERE med.drone.serialNumber = :serialNumber")
    Optional<List<Medication>> findAllByDrone(String serialNumber);
}
