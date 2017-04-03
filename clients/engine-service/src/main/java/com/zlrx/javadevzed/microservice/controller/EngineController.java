package com.zlrx.javadevzed.microservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EngineController {

    @RequestMapping("/")
    public List<String> getEngines() {
        List<String> engines = new ArrayList<>();
        engines.add("V6");
        engines.add("V8");
        engines.add("V12");
        return engines;
    }

}
