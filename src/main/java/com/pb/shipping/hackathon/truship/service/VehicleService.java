package com.pb.shipping.hackathon.truship.service;

import com.pb.shipping.hackathon.truship.model.Vehicle;
import com.pb.shipping.hackathon.truship.repo.VehicleRepository;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle creteVehicle(Vehicle vehicle) {

        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAll(){
        return  vehicleRepository.findAll();
    }

    public Vehicle getVehicleByRegNo(long regNo) throws NotFound {
        return vehicleRepository.findById(regNo).orElseThrow(NotFound::new);
    }
}
