package dev.fernandobasso.solid.lsp.cars.nok1;

public class Racecar extends Car {
  @Override
  public double getCabinWidth() {
    throw new RuntimeException("getCabinWith() not implemented for racecars");
  }

  public double getCockpitWidth() {
    return 0.9;
  }
}
