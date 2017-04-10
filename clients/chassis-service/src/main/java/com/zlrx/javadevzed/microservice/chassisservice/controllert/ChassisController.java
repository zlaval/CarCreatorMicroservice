package com.zlrx.javadevzed.microservice.chassisservice.controllert;

import com.zlrx.javadevzed.microservice.chassisinterface.Chassis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChassisController {

    @RequestMapping("/")
    public List<Chassis> getChassis() {
        List<Chassis> chassiss = new ArrayList<>();
        chassiss.add(new Chassis("Lada", 16545613, "Red"));
        chassiss.add(new Chassis("Audi", 69687455, "Green"));
        chassiss.add(new Chassis("Ford", 56453456, "Blue"));
        return chassiss;
    }


}
