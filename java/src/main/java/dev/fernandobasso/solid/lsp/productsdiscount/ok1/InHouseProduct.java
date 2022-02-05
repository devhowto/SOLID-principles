package dev.fernandobasso.solid.lsp.productsdiscount.ok1;

public class InHouseProduct extends Product {
  @Override
  public double getDiscount() {
    applyExtraDiscount();
    return _discount;
  }

  public void applyExtraDiscount() {
    _discount = _discount * 1.5;
  }
}
