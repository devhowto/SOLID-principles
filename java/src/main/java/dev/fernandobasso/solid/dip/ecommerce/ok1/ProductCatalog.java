package dev.fernandobasso.solid.dip.ecommerce.ok1;

import java.util.List;

public class ProductCatalog {
  public void listAllProducts() {
    ProductRepository productRepository = ProductFactory.create();

    List<String> products = productRepository.getAllProductNames();

    for (String product : products) {
      System.out.println(product);
    }
  }
}
