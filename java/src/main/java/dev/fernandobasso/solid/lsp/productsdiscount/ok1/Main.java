package dev.fernandobasso.solid.lsp.productsdiscount.ok1;

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
      // Because we changed InHouseProduct, we are now able to treat all
      // products as generic Product and ask for its discount.
      // InHouseProduct#getDiscount() has been updated to handle the
      // situation in a way that does not require calling/client code to
      // work around the differences between Product and InHouseProduct.
      //

      System.out.println(product.getDiscount());
    }
  }
}

//
// We should not have to ask for the type of the product. We should
// be able to deal with all products as a generic Product objects.
//
