package com.zlrx.javadevzed.microservice.creatorui.controller;


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

    @RequestMapping("/carpart")
    public List<String> getCarParts() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("engine-service");
        List<String> engines = new RestTemplate().getForObject(serviceInstance.getUri(), List.class);
        return engines;
    }

    @RequestMapping("/")
    public String getWheel() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("wheel-service");
        return new RestTemplate().getForObject(serviceInstance.getUri(), String.class);
    }

}
