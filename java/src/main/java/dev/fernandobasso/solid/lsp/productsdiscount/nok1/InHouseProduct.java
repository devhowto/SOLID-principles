package dev.fernandobasso.solid.lsp.productsdiscount.nok1;

public class InHouseProduct extends Product {
  public void applyExtraDiscount() {
    _discount = _discount * 1.5;
  }
}
