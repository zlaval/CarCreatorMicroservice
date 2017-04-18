package com.zlrx.javadevzed.microservice.creatorui.service;

import com.zlrx.javadevzed.microservice.chassisinterface.Chassis;
import com.zlrx.javadevzed.microservice.engineinterface.Engine;
import com.zlrx.javadevzed.microservice.wheelinterface.Wheel;

import java.util.List;

public interface CarpartService {

    List<Chassis> getChassis();

    List<Wheel> getWheel();

    List<Engine> getEngine();

}
