package dev.fernandobasso.solid.lsp.cars.nok1;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    Car car = new Car();
    Car racecar = new Racecar();

    List<Car> cars = new ArrayList<Car>();
    cars.add(car);
    cars.add(racecar);

    for (Car aCar : cars) {
      if (aCar instanceof Racecar)
        System.out.println(((Racecar) aCar).getCockpitWidth());
      else
        System.out.println(aCar.getCabinWidth());
    }
  }
}
