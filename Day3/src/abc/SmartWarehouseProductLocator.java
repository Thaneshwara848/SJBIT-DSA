package abc;
import java.util.HashMap;
public class SmartWarehouseProductLocator {
    public static void main(String[] args) {
        // HashMap stores productId as key and location as value
        HashMap<Integer, String> warehouse = new HashMap<>();
        // CREATE - Add products with rack locations
        warehouse.put(101, "Rack A1");
        warehouse.put(102, "Rack B2");
        warehouse.put(103, "Rack C3");
        System.out.println("All Products: " + warehouse);
        // READ - Find product location
        int searchProductId = 102;
        if (warehouse.containsKey(searchProduxctId)) {
            System.out.println("Product ID " + searchProductId +
                    " is located at " + warehouse.get(searchProductId));
        } else {
            System.out.println("Product not found");
        }
        // UPDATE - Change product location
        warehouse.put(102, "Rack D4");
        System.out.println("After Location Update: " + warehouse);
        // DELETE - Remove product
        warehouse.remove(103);
        System.out.println("After Removing Product 103: " + warehouse);
    }
}