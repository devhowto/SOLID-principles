package dev.fernandobasso.solid.lsp.cars.ok1;

public class Racecar extends Vehicle {
  @Override
  public double getInteriorWidth() {
    return getCockpitWidth();
  }

  public double getCockpitWidth() {
    return 0.9;
  }
}
