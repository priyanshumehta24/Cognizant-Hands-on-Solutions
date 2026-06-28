import java.util.*;

class Product {
    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
}

public class SearchFunction {

    public static int linearSearch(Product[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].id == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid].id == target) {
                return mid;
            }
            else if (arr[mid].id < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new Product(101, "Laptop", "Electronics");
        products[1] = new Product(102, "Shoes", "Fashion");
        products[2] = new Product(103, "Book", "Education");
        products[3] = new Product(104, "Phone", "Electronics");
        products[4] = new Product(105, "Watch", "Accessories");
        products[5] = new Product(106, "Bag", "Fashion");

        System.out.println("Products in store:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].id + " " + products[i].name);
        }

        int search = 104;

        int result1 = linearSearch(products, search);
        if (result1 != -1) {
            System.out.println("\nFound using linear search at position: " + result1);
        }

        int result2 = binarySearch(products, search);
        if (result2 != -1) {
            System.out.println("Found using binary search at position: " + result2);
        }

        System.out.println("\nTime Complexity:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");

        System.out.println("\nBinary search is faster but needs sorted data.");
    }
}