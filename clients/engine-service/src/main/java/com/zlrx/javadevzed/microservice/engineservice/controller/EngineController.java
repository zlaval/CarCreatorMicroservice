package com.zlrx.javadevzed.microservice.engineservice.controller;


import com.zlrx.javadevzed.microservice.engineinterface.Engine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EngineController {

    @RequestMapping("/")
    public List<Engine> getEngines() {
        List<Engine> engines = new ArrayList<>();
        engines.add(new Engine("BMW",2400,12));
        engines.add(new Engine("Lada",1000,3));
        engines.add(new Engine("Suzuki",1400,4));
        return engines;
    }

}
