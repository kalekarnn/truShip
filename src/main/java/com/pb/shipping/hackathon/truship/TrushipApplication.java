package com.pb.shipping.hackathon.truship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pb.shipping.hackathon.truship")
public class TrushipApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrushipApplication.class, args);
    }

}
