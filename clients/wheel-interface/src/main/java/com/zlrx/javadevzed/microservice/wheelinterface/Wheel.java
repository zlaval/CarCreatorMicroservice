package com.zlrx.javadevzed.microservice.wheelinterface;

public class Wheel {

    private Integer width;
    private Integer height;
    private Integer radial;

    public Wheel() {
    }

    public Wheel(Integer width, Integer height, Integer radial) {
        this.width = width;
        this.height = height;
        this.radial = radial;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getRadial() {
        return radial;
    }

    public void setRadial(Integer radial) {
        this.radial = radial;
    }
}
