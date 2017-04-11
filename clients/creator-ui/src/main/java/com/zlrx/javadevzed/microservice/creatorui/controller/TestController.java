package com.zlrx.javadevzed.microservice.creatorui.controller;


import com.zlrx.javadevzed.microservice.chassisinterface.Chassis;
import com.zlrx.javadevzed.microservice.creatorui.client.ChassisRestClient;
import com.zlrx.javadevzed.microservice.creatorui.client.EngineRestClient;
import com.zlrx.javadevzed.microservice.creatorui.client.WheelRestClient;
import com.zlrx.javadevzed.microservice.engineinterface.Engine;
import com.zlrx.javadevzed.microservice.wheelinterface.Wheel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class TestController {

    @Inject
    private ChassisRestClient chassisRestClient;

    @Inject
    private EngineRestClient engineRestClient;

    @Inject
    private WheelRestClient wheelRestClient;

    @RequestMapping("/engine")
    public List<Engine> getCarParts() {
        return engineRestClient.getEngine();
    }

    @RequestMapping("/wheel")
    public List<Wheel> getWheel() {
        return wheelRestClient.getWheel();
    }

    @RequestMapping("/")
    public List<Chassis> getChasses() {
        return chassisRestClient.getChassis();
    }

}
