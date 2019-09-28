package com.pb.shipping.hackathon.truship.rest;

import com.pb.shipping.hackathon.truship.ext.CreateShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/shipment")
public class ShipperController {

    @Autowired
    private ShipperService shipperService;

    @PostMapping
    public Shipment createShipment(@RequestBody CreateShipmentRequest createShipmentRequest) {
        return shipperService.createShipment(createShipmentRequest);
    }
}
