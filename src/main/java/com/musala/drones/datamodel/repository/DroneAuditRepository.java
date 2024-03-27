package com.musala.drones.datamodel.repository;

import com.musala.drones.datamodel.data.DroneAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneAuditRepository extends JpaRepository<DroneAudit, Long> {
}
