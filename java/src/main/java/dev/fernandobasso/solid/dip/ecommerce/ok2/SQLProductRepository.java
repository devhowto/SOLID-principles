package dev.fernandobasso.solid.dip.ecommerce.ok2;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository {
  public List<String> getAllProductNames() {
    //
    // Pretend these names come from a `SELECT name FROM products`.
    //
    return Arrays.asList("Tomb Raider I 1996", "Hitman Codename 47");
  }
}
