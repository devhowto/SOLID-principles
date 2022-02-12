package dev.fernandobasso.solid.isp.printscanfax.nok1;

public class Main {
  public static void main (String[] args) {
    XeroxWorkCenter xwc = new XeroxWorkCenter();

    xwc.getPrintSpoolDetails();
    xwc.scanPhoto();
    xwc.internetFax();
  }
}
