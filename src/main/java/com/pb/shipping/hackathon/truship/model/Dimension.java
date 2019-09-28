package com.pb.shipping.hackathon.truship.model;


import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Dimension {
    private int length;
    private int height;
    private int width;
}