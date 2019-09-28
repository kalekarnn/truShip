package com.pb.shipping.hackathon.truship.rest;

import com.pb.shipping.hackathon.truship.ext.CreateShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @PostMapping
    public Shipment createShipment(@RequestBody CreateShipmentRequest createShipmentRequest) {
        return shipmentService.createShipment(createShipmentRequest);
    }

    @GetMapping
    public List<Shipment> getAll() {
        return shipmentService.getAll();
    }

    @GetMapping("/shipperId/{shipperId}")
    public List<Shipment> getShipmentByShipperId(@PathVariable("shipperId") long shipperId) {
        return shipmentService.getShipmentByShipperId(shipperId);
    }
}
