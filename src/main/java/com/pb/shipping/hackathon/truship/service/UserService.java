package com.pb.shipping.hackathon.truship.service;

import com.pb.shipping.hackathon.truship.ext.SearchShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.repo.ShipmentRepository;
import com.pb.shipping.hackathon.truship.response.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Autowired
    private ShipmentRepository shipmentRepository;

    public List<Shipment> searchShipments(SearchShipmentRequest request){
        return shipmentRepository.findAll();
    }
}
