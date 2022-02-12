package dev.fernandobasso.solid.isp.printscanfax.nok1;

public class XeroxWorkCenter implements Multi {
  public void print() {
    System.out.println("XeroxWorkCenter: print()");
  }

  public String getPrintSpoolDetails() {
    System.out.println("XeroxWorkCenter: getPrintSpoolDetails()");
    return "XeroxWorkCenter: getPrintSpoolDetails()";
  }

  public void scan() {
    System.out.println("XeroxWorkCenter: scan()");
  }

  public void scanPhoto() {
    System.out.println("XeroxWorkCenter: scanPhoto()");
  }

  public void fax() {
    System.out.println("XeroxWorkCenter: fax()");
  }

  public void internetFax() {
    System.out.println("XeroxWorkCenter: internetFax()");
  }
}
