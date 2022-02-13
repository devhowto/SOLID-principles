package dev.fernandobasso.solid.dip.ecommerce.nok1;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository {
  public List<String> getAllProductNames() {
    //
    // Pretend these names come from a `SELECT name FROM products`.
    //
    return Arrays.asList("Tomb Raider I 1996", "Hitman Codename 47");
  }
}
