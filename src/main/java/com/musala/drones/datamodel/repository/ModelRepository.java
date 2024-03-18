package com.musala.drones.datamodel.repository;

import com.musala.drones.datamodel.data.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
}
