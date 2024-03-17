package com.musala.drones.datamodel.repository;

import com.musala.drones.datamodel.data.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
