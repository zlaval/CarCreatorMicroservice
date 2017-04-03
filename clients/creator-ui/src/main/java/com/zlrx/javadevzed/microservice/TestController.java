package com.zlrx.javadevzed.microservice;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.util.List;

@RestController
public class TestController {

    @Inject
    private DiscoveryClient discoveryClient;

    @RequestMapping("/")
    public List<String> getCarParts() {
        List<ServiceInstance> clients = discoveryClient.getInstances("engine-service");
        List<String> engines = new RestTemplate().getForObject(clients.get(0).getUri(), List.class);
        return engines;
    }

}
