/**
 * This is a product factory. The name of the file is ProductFactory
 * because we don't want to tie it to a technology or implementation.
 *
 * Names like "SQLProductFactory" or "MongoProductFactory" are not
 * advisable for situations like this.
 *
 * It is really best, and recommended, to use generic names not tied to
 * technologies.
 */

package dev.fernandobasso.solid.dip.ecommerce.ok2;

public class ProductFactory {
  public static ProductRepository create() {
    return new SQLProductRepository();
  }
}
