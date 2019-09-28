package com.pb.shipping.hackathon.truship.repo;

import com.pb.shipping.hackathon.truship.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
