package com.zlrx.javadevzed.microservice.wheelservice.controller;


import com.zlrx.javadevzed.microservice.wheelinterface.Wheel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WheelController {

    @Value("${wheel}")
    private String wheel;

    @RequestMapping("/")
    public List<Wheel> getWheel() {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(205, 55, 16));
        wheels.add(new Wheel(255, 65, 18));
        return wheels;
    }

}
