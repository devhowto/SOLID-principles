package dev.fernandobasso.solid.lsp.cars.ok1;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    Vehicle car = new Car();
    Vehicle racecar = new Racecar();

    //
    // Note that cars and racing cars are of reference type Vehicle.
    //
    List<Vehicle> cars = new ArrayList<Vehicle>();
    cars.add(car);
    cars.add(racecar);

    for (Vehicle aCar : cars) {
      //
      // We are not using conditionals to ask for the type of car.
      // Instead, we ask for the interior width and that is it.
      //
      aCar.getInteriorWidth();
    }
  }
}
