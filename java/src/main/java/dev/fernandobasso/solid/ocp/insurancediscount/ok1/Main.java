package dev.fernandobasso.solid.ocp.insurancediscount.ok1;

// import dev.fernandobasso.solid.ocp.nok1.HealthInsuranceCustomerProfile;

public class Main {
  public static void main(String[] args) {
    InsurancePremiumDiscountCalculator calc = new InsurancePremiumDiscountCalculator();

    int discountHealth = calc.calcPremiumDiscountPercent(new HealthInsuranceCustomerProfile());
    int discountVehicle = calc.calcPremiumDiscountPercent(new VehicleInsuranceCustomerProfile());

    System.out.println(discountHealth);
    System.out.println(discountVehicle);
  }
}
