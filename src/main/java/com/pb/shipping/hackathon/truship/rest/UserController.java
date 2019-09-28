package com.pb.shipping.hackathon.truship.rest;

import com.pb.shipping.hackathon.truship.ext.SearchShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Requests;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.response.SearchResponse;
import com.pb.shipping.hackathon.truship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/shipments/search")
    public SearchResponse searchShipment(@Valid @RequestBody SearchShipmentRequest searchShipmentRequest){

        List<Shipment> shipments = userService.searchShipments(searchShipmentRequest);
        SearchResponse response = new SearchResponse();
        response.setShipments(shipments);
        return response;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/shipment/book/{requestId}")
    public ResponseEntity<?> bookShipment(@PathVariable Long requestId){

        Optional optional = userService.findById(requestId);

        if (optional.isPresent()){
            userService.updateRequestsToBook((Requests)optional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/shipment/request")
    public ResponseEntity<?> bookShipment(@RequestBody Requests request){
        request.setRequestDate(LocalDateTime.now());
        userService.saveRequests(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/shipment/requests/{shipmentId}")
    public List<Requests> getAllRequestForShipment(@PathVariable Long shipmentId){
        return userService.getAllRequestsByShipmmentID(shipmentId);
    }




}
