package com.pb.shipping.hackathon.truship.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Capacity {
    private double volume;
    private double weight;
}
