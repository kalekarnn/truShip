package com.pb.shipping.hackathon.truship.repo;

import com.pb.shipping.hackathon.truship.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    List<Shipment> findAllByShipperId(long shipperId);
}
