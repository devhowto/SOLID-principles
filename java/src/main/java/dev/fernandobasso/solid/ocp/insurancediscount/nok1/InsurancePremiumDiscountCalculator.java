package dev.fernandobasso.solid.ocp.insurancediscount.nok1;

public class InsurancePremiumDiscountCalculator {
  public int calcPremiumDiscountPercent(HealthInsuranceCustomerProfile customer) {
    if (customer.isLoyalCustomer())
      return 20;

    return 0;
  }

  public int calcPremiumDiscountPercent(VehicleInsuranceCustomerProfile customer) {
    if (customer.isLoyalCustomer())
      return 20;

    return 0;
  }
}
