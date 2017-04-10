package com.zlrx.javadevzed.microservice.chassisinterface;

public class Chassis {
    private String producer;
    private Integer number;
    private String color;


    public Chassis(String producer, Integer number, String color) {
        this.producer = producer;
        this.number = number;
        this.color = color;
    }

    public Chassis() {
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
