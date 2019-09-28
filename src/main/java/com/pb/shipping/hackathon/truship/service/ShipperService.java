package com.pb.shipping.hackathon.truship.service;

import com.pb.shipping.hackathon.truship.ext.CreateShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Capacity;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.repo.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipperService {

    @Autowired
    ShipmentRepository shipmentRepository;

    public Shipment createShipment(CreateShipmentRequest createShipmentRequest) {
        return shipmentRepository.save(convertTo(createShipmentRequest));
    }

    private Shipment convertTo(CreateShipmentRequest createShipmentRequest) {
        Shipment shipment = new Shipment();
        shipment.setFromLocation(createShipmentRequest.getFromLocation());
        shipment.setToLocation(createShipmentRequest.getToLocation());
        shipment.setShipmentDate(createShipmentRequest.getShipmentDate());
        shipment.setShipmentTime(createShipmentRequest.getShipmentTime());
        shipment.setShipperId(createShipmentRequest.getShipperId());
        shipment.setCapacity(new Capacity(createShipmentRequest.getVolume(), createShipmentRequest.getWeight()));
        return shipment;
    }
}
