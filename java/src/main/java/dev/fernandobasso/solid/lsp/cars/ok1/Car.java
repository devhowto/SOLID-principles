package dev.fernandobasso.solid.lsp.cars.ok1;

public class Car extends Vehicle {
  @Override
  public double getInteriorWidth() {
    return getCabinWidth();
  }

  protected double getCabinWidth() {
    return 2.0;
  }
}
