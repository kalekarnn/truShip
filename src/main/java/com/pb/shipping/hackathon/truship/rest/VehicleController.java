package com.pb.shipping.hackathon.truship.rest;

import com.pb.shipping.hackathon.truship.model.Vehicle;
import com.pb.shipping.hackathon.truship.service.VehicleService;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.creteVehicle(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAll() {
        return vehicleService.getAll();
    }

    @GetMapping("/{regNo}")
    public Vehicle getVehicle(@PathVariable("regNo") long regNo) throws NotFound {
        return vehicleService.getVehicleByRegNo(regNo);
    }
}
