package com.pb.shipping.hackathon.truship.repo;

import com.pb.shipping.hackathon.truship.model.Requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by NEX4SXN on 9/28/2019.
 */
@Repository
public interface RequestsRepository extends JpaRepository<Requests, Long>{

    public List<Requests> findByShipmentId(Long shipmentId);
}
