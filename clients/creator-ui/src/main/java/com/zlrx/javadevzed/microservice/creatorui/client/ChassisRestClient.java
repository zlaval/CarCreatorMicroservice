package com.zlrx.javadevzed.microservice.creatorui.client;

import com.zlrx.javadevzed.microservice.chassisinterface.Chassis;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("chassis-service")
public interface ChassisRestClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Chassis> getChassis();

}
