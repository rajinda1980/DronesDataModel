package com.musala.drones.datamodel.repository;

import com.musala.drones.datamodel.data.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
