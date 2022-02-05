package dev.fernandobasso.solid.lsp.birds.nok1;

public class Main {
  public static void main (String[] args) {
    Bird bird = new Bird();
    Bird rubberDuck = new RubberDuck();

    bird.fly();
    rubberDuck.fly();
  }
}
