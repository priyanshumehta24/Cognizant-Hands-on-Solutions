import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return productId + " | " + productName + " | " + quantity + " | $" + price;
    }
}

class Inventory {
    HashMap<Integer, Product> products = new HashMap<>();

    void addProduct(Product p) {
        products.put(p.productId, p);
        System.out.println("Product added: " + p.productName);
    }

    void updateProduct(int id, String name, int qty, double price) {
        if (products.containsKey(id)) {
            Product p = products.get(id);
            p.productName = name;
            p.quantity = qty;
            p.price = price;
            System.out.println("Product updated: " + name);
        } else {
            System.out.println("Product not found!");
        }
    }

    void deleteProduct(int id) {
        if (products.containsKey(id)) {
            products.remove(id);
            System.out.println("Product deleted!");
        } else {
            System.out.println("Product not found!");
        }
    }

    void display() {
        System.out.println("\n=== Inventory ===");
        for (Product p : products.values()) {
            System.out.println(p);
        }
        System.out.println("Total: " + products.size() + " products\n");
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addProduct(new Product(101, "Laptop", 10, 899.99));
        inv.addProduct(new Product(102, "Mouse", 50, 24.99));
        inv.addProduct(new Product(103, "Keyboard", 30, 49.99));

        inv.display();

        inv.updateProduct(102, "Wireless Mouse", 45, 29.99);
        inv.display();

        inv.deleteProduct(103);
        inv.display();

        System.out.println("=== Time Complexity ===");
        System.out.println("Add: O(1)");
        System.out.println("Update: O(1)");
        System.out.println("Delete: O(1)");
        System.out.println("Display: O(n)");
    }
}