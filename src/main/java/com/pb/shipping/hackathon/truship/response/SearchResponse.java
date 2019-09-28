package com.pb.shipping.hackathon.truship.response;

import com.pb.shipping.hackathon.truship.model.Shipment;
import lombok.Data;

import java.util.List;

/**
 * Created by NEX4SXN on 9/28/2019.
 */
@Data
public class SearchResponse {

    private List<Shipment> shipments;
}
