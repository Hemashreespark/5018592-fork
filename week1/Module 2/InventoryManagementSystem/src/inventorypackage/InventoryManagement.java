package inventorypackage;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.productId)) {
            inventory.put(product.productId, product);
        } else {
            System.out.println("Product with ID " + product.productId + " does not exist.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagement ims = new InventoryManagement();

        ims.addProduct(new Product(1, "Laptop", 10, 1,00,000));
        ims.addProduct(new Product(2, "Smartphone", 25, 50,000));
        ims.addProduct(new Product(3, "Tablet", 15, 25,000));

        System.out.println("Inventory:");
        ims.displayProducts();

        ims.updateProduct(new Product(2, "Smartphone", 20, 10,000));

        System.out.println("\nInventory after update:");
        ims.displayProducts();

        ims.deleteProduct(3);

        System.out.println("\nInventory after deletion:");
        ims.displayProducts();
    }
}

