package dev.fernandobasso.solid.lsp.productsdiscount.nok1;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    //
    // All three objects are of reference type Product. InHouseProduct is,
    // however, a subtype of Product, and has a method that Product doesn't
    // have.
    //
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new InHouseProduct();

    List<Product> products = new ArrayList<Product>();

    products.add(p1);
    products.add(p2);
    products.add(p3);

    for (Product product : products) {
      //
      // Tell, don't ask.
      //
      // But here we are asking if product is an instance of
      // InHouseProduct and applying the extra discount if the instance
      // of test passes. We should find a way to avoid asking for the
      // type.
      //
      if (product instanceof InHouseProduct) {
        ((InHouseProduct) product).applyExtraDiscount();
      }

      System.out.println(product.getDiscount());
    }
  }
}

//
// We should not have to ask for the type of the product. We should
// be able to deal with all products as a generic Product objects.
//
