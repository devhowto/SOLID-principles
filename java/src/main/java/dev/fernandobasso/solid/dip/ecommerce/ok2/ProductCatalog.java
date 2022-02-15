package dev.fernandobasso.solid.dip.ecommerce.ok2;

import java.util.List;

public class ProductCatalog {
  protected ProductRepository productRepository;

  public ProductCatalog(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void listAllProducts() {
    List<String> products = productRepository.getAllProductNames();

    for (String product : products) {
      System.out.println(product);
    }
  }
}
