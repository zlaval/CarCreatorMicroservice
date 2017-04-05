package com.zlrx.javadevzed.microservice.wheelservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WheelController {

    @Value("${wheel}")
    private String wheel;

    @RequestMapping("/")
    public String getWheel() {
        return wheel;
    }

}
