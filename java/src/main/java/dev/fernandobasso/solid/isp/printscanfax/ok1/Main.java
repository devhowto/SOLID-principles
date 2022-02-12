package dev.fernandobasso.solid.isp.printscanfax.ok1;

public class Main {
  public static void main (String[] args) {
    XeroxWorkCenter xwc = new XeroxWorkCenter();
    HPPrintAndScan hps = new HPPrintAndScan();
    CannonPrinter cp = new CannonPrinter();

    xwc.internetFax();
    hps.scanPhoto();
    cp.print();
  }
}
