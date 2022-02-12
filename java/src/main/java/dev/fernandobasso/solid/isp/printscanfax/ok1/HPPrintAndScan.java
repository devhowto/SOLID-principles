package dev.fernandobasso.solid.isp.printscanfax.ok1;

public class HPPrintAndScan implements Print, Scan {
  public void print() {
    System.out.println("HPPrintAndScan: print()");
  }

  public String getPrintSpoolDetails() {
    System.out.println("HPPrintAndScan: getPrintSpoolDetails()");
    return "HPPrintAndScan: getPrintSpoolDetails()";
  }

  public void scan() {
    System.out.println("HPPrintAndScan: scan()");
  }

  public void scanPhoto() {
    System.out.println("HPPrintAndScan: scanPhoto()");
  }
}
