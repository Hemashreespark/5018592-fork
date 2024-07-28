package inventorypackage;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    // Update a product in the inventory
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.productId)) {
            inventory.put(product.productId, product);
        } else {
            System.out.println("Product with ID " + product.productId + " does not exist.");
        }
    }

    // Delete a product from the inventory
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    // Display all products
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagement ims = new InventoryManagement();

        // Adding products
        ims.addProduct(new Product(1, "Laptop", 10, 999.99));
        ims.addProduct(new Product(2, "Smartphone", 25, 499.99));
        ims.addProduct(new Product(3, "Tablet", 15, 299.99));

        // Display products
        System.out.println("Inventory:");
        ims.displayProducts();

        // Updating a product
        ims.updateProduct(new Product(2, "Smartphone", 20, 459.99));

        // Display products after update
        System.out.println("\nInventory after update:");
        ims.displayProducts();

        // Deleting a product
        ims.deleteProduct(3);

        // Display products after deletion
        System.out.println("\nInventory after deletion:");
        ims.displayProducts();
    }
}

