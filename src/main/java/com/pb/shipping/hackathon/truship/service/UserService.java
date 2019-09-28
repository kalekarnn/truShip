package com.pb.shipping.hackathon.truship.service;

import com.pb.shipping.hackathon.truship.ext.SearchShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Requests;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.repo.RequestsRepository;
import com.pb.shipping.hackathon.truship.repo.ShipmentRepository;
import com.pb.shipping.hackathon.truship.response.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private ShipmentRepository shipmentRepository;

    @Autowired
    private RequestsRepository requestsRepository;

    public List<Shipment> searchShipments(SearchShipmentRequest request){
        return shipmentRepository.findAll();
    }

    public List<Requests> getAllRequestsByShipmmentID(long shipmentId){
        return requestsRepository.findByShipmentId(shipmentId);
    }

    public void saveRequests(Requests request){
        request.setStatus(1);// waiting
        requestsRepository.save(request);
    }

    public void updateRequestsToBook(Requests request){
        request.setUpdatedDate(LocalDateTime.now());
        request.setStatus(2);//approved
        requestsRepository.save(request);
    }

    public Optional findById(Long id){
        return requestsRepository.findById(id);

    }



}
