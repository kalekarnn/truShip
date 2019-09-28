package com.pb.shipping.hackathon.truship.ext;


import com.pb.shipping.hackathon.truship.model.Capacity;
import lombok.Data;

@Data
public class SearchShipmentRequest {

    private String fromCity;
    private String toCity;
    private double weight;
    private Capacity capacity;


}
