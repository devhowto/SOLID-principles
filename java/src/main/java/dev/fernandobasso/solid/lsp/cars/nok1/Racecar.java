package dev.fernandobasso.solid.lsp.cars.nok1;

public class Racecar extends Car {

  /**
   * We override the `getCabinWidth` method inherited from `Car` so it
   * does not return a width since racing cars do not have cabins, but
   * cockpits.
   */
  @Override
  public double getCabinWidth() {
    throw new RuntimeException("getCabinWith() not implemented for racecars");
  }

  public double getCockpitWidth() {
    return 0.9;
  }
}
