package com.zlrx.javadevzed.microservice.creatorui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zlrx.javadevzed.microservice.chassisinterface.Chassis;
import com.zlrx.javadevzed.microservice.creatorui.client.ChassisRestClient;
import com.zlrx.javadevzed.microservice.creatorui.client.EngineRestClient;
import com.zlrx.javadevzed.microservice.creatorui.client.WheelRestClient;
import com.zlrx.javadevzed.microservice.engineinterface.Engine;
import com.zlrx.javadevzed.microservice.wheelinterface.Wheel;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

@Service
public class CarpartServiceImpl implements CarpartService {

    @Inject
    private ChassisRestClient chassisRestClient;

    @Inject
    private EngineRestClient engineRestClient;

    @Inject
    private WheelRestClient wheelRestClient;


    @Override
    @HystrixCommand(fallbackMethod = "getDefaultChassis")
    public List<Chassis> getChassis() {
        return chassisRestClient.getChassis();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultWheel")
    public List<Wheel> getWheel() {
        return wheelRestClient.getWheel();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultEngine")
    public List<Engine> getEngine() {
        return engineRestClient.getEngine();
    }


    private List<Chassis> getDefaultChassis() {
        return Collections.singletonList(new Chassis("Chassis default", 1, "gray"));
    }


    private List<Wheel> getDefaultWheel() {
        return Collections.singletonList(new Wheel(205, 45, 17));
    }


    private List<Engine> getDefaultEngine() {
        return Collections.singletonList(new Engine("Engine default", 250, 12));
    }


}
