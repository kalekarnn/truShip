package com.pb.shipping.hackathon.truship.repo;

import com.pb.shipping.hackathon.truship.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findAllByShipperId(String shipperId);
}
