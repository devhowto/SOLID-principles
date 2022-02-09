package dev.fernandobasso.solid.ocp.insurancediscount.ok1;

public class InsurancePremiumDiscountCalculator {
  public int calcPremiumDiscountPercent(CustomerProfile customer) {
    if (customer.isLoyalCustomer())
      return 20;

    return 0;
  }
}
