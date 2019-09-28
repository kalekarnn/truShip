package com.pb.shipping.hackathon.truship.repo;

import com.pb.shipping.hackathon.truship.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
