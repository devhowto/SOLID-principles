package dev.fernandobasso.solid.dip.ecommerce.nok1;

import java.util.List;

public class ProductCatalog {
  public void listAllProducts() {
    SQLProductRepository sqlProductRepo = new SQLProductRepository();
    List<String> products = sqlProductRepo.getAllProductNames();

    for (String product : products) {
      System.out.println(product);
    }
  }
}

/*
 * ProductCatalog (a high-level module) is directly depending on
 * SQLProductRepository (a low level-module), violating the Dependency
 * Inversion Principle.
 */
