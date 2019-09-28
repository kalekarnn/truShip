package com.pb.shipping.hackathon.truship.rest;

import com.pb.shipping.hackathon.truship.ext.SearchShipmentRequest;
import com.pb.shipping.hackathon.truship.model.Shipment;
import com.pb.shipping.hackathon.truship.response.SearchResponse;
import com.pb.shipping.hackathon.truship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @RequestMapping(method = RequestMethod.POST, value = "/shipment/book/{id}")
    public ResponseEntity<?> bookShipment(@PathVariable int id){

        if (id < 5)
            return new ResponseEntity<>(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
