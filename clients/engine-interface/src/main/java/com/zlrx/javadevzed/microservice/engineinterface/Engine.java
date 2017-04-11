package com.zlrx.javadevzed.microservice.engineinterface;

public class Engine {
  private String producer;
  private Integer performance;
  private Integer cylinder;

  public Engine(String producer, Integer performance, Integer cylinder) {
    this.producer = producer;
    this.performance = performance;
    this.cylinder = cylinder;
  }

  public Engine() {
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public Integer getPerformance() {
    return performance;
  }

  public void setPerformance(Integer performance) {
    this.performance = performance;
  }

  public Integer getCylinder() {
    return cylinder;
  }

  public void setCylinder(Integer cylinder) {
    this.cylinder = cylinder;
  }
}
