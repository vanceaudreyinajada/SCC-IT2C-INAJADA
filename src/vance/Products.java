package vance;

import java.util.Scanner;

public class Products {
    Product[] productList;
    int count;

    public Products(int size) {
        productList = new Product[size];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count < productList.length) {
            productList[count++] = product;
        } else {
            System.out.println("Error: Product list is full.");
        }
    }

    public void inputProducts() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numProducts = input.nextInt();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("Name: ");
            String productName = input.next();
            System.out.print("Price: ");
            double productPrice = input.nextDouble();
            System.out.print("Stocks: ");
            int stockQty = input.nextInt();
            System.out.print("Sold: ");
            int soldQty = input.nextInt();

            Product product = new Product();
            product.setProduct(id, productName, productPrice, stockQty, soldQty);
            addProduct(product);
        }

        input.close();
    }

    public void displayProducts() {
        if (count == 0) {
            System.out.println("No products available.");
        } else {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.printf("| %-5s | %-15s | %-10s | %-7s | %-5s | %-10s | %-15s | %-10s |%n", 
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "Total Value", "Status");
            System.out.println("--------------------------------------------------------------------------------");
            for (int i = 0; i < count; i++) {
                productList[i].viewProduct();
            }
            System.out.println("--------------------------------------------------------------------------------");
        }
    }
}

