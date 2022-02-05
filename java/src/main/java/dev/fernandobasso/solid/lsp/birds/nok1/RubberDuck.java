package dev.fernandobasso.solid.lsp.birds.nok1;

public class RubberDuck extends Bird {
  @Override
  public void fly() {
    throw new RuntimeException("fly() method not implemented.");
  }
}
