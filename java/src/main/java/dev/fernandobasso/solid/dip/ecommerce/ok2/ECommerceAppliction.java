package dev.fernandobasso.solid.dip.ecommerce.ok2;

public class ECommerceAppliction {
  public static void main(String[] args) {
    ProductRepository productRepository = ProductFactory.create();
    new ProductCatalog(productRepository).listAllProducts();
  }
}
