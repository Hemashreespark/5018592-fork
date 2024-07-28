package Ecommercepackage;

import java.util.Arrays;
import java.util.Comparator;

public class Search {

	public class ECommerceSearch {
	    // Linear search to find a product by name
	    public static Product linearSearchByName(Product[] products, String name) {
	        for (Product product : products) {
	            if (product.productName.equalsIgnoreCase(name)) {
	                return product;
	            }
	        }
	        return null;
	    }
	}

	// Binary search to find a product by name
    public static Product binarySearchByName(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(name);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Creating and sorting products for binary search
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics"),
            new Product(4, "Headphones", "Accessories")
        };

        // Sort products by name for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Searching for a product
        Product result = binarySearchByName(products, "Smartphone");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}

