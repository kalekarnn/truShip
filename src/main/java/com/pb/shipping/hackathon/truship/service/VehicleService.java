package com.pb.shipping.hackathon.truship.service;

import com.pb.shipping.hackathon.truship.model.Vehicle;
import com.pb.shipping.hackathon.truship.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle creteVehicle(Vehicle vehicle) {

        return vehicleRepository.save(vehicle);
    }
}
