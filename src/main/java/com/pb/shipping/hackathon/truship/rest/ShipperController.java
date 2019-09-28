package com.pb.shipping.hackathon.truship.rest;

import com.pb.shipping.hackathon.truship.ext.CreateShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/shipment")
public class ShipperController {

    @Autowired
    private ShipperService shipperService;

    @PostMapping
    public Shipment createShipment(@RequestBody CreateShipmentRequest createShipmentRequest) {
        return shipperService.createShipment(createShipmentRequest);
    }

    @GetMapping
    public List<Shipment> getAll() {
        return shipperService.getAll();
    }
}
