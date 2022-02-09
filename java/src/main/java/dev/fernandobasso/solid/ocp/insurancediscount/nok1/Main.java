package dev.fernandobasso.solid.ocp.insurancediscount.nok1;

public class Main {
  public static void main(String[] args) {
    InsurancePremiumDiscountCalculator calc = new InsurancePremiumDiscountCalculator();

    int discountHealth = calc.calcPremiumDiscountPercent(new HealthInsuranceCustomerProfile());
    int discountVehicle = calc.calcPremiumDiscountPercent(new VehicleInsuranceCustomerProfile());

    System.out.println(discountHealth);
    System.out.println(discountVehicle);
  }
}
