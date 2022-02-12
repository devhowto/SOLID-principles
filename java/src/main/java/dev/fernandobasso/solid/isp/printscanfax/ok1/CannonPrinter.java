package dev.fernandobasso.solid.isp.printscanfax.ok1;

public class CannonPrinter implements Print {
  public void print() {
    System.out.println("CannongPrinter: print()");
  }

  public String getPrintSpoolDetails() {
    System.out.println("CannongPrinter: getPrintSpoolDetails()");
    return "CannongPrinter: getPrintSpoolDetails()";
  }
}
