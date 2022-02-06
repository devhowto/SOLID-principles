package dev.fernandobasso.solid.lsp.productsdiscount.ok1;

public class InHouseProduct extends Product {
  @Override
  public double getDiscount() {
    //
    // When getDiscount() is called, it applies the extra discount
    // behind the scenes, without requiring client code to check for
    // types, instances and doing conditions around situations.
    //
    _applyExtraDiscount();

    return _discount;
  }

  public void _applyExtraDiscount() {
    _discount = _discount * 1.5;
  }
}
