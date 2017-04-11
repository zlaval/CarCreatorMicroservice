package com.zlrx.javadevzed.microservice.creatorui.controller;


import com.zlrx.javadevzed.microservice.chassisinterface.Chassis;
import com.zlrx.javadevzed.microservice.creatorui.client.ChassisRestClient;
import com.zlrx.javadevzed.microservice.creatorui.client.EngineRestClient;
import com.zlrx.javadevzed.microservice.engineinterface.Engine;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.util.List;

@RestController
public class TestController {

    @Inject
    private LoadBalancerClient loadBalancerClient;

    @Inject
    private ChassisRestClient chassisRestClient;

    @Inject
    private EngineRestClient engineRestClient;

    @RequestMapping("/engine")
    public List<Engine> getCarParts() {
       return engineRestClient.getEngine();
    }

    @RequestMapping("/wheel")
    public String getWheel() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("wheel-service");
        return new RestTemplate().getForObject(serviceInstance.getUri(), String.class);
    }

    @RequestMapping("/")
    public List<Chassis> getChasses() {
        return chassisRestClient.getChassis();
    }

}
