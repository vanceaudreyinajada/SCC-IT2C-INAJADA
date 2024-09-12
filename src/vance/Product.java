package vance;

public class Product {
    int productId;
    String productName;
    double productPrice;
    int stockQty;
    int soldQty;

    public void setProduct(int id, String name, double price, int stocks, int sold) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
        this.stockQty = stocks;
        this.soldQty = sold;
    }

    public double calculateProfit() {
        return productPrice * soldQty;
    }

    public double calculateTotalValue() {
        return productPrice * stockQty;
    }

    public void viewProduct() {
        double profit = calculateProfit();
        double totalValue = calculateTotalValue();
        String availability = (stockQty > 0) ? "Available" : "Out-of-Stocks";

        System.out.printf("| %-5d | %-15s | %-10.2f | %-7d | %-5d | %-10.2f | %-15.2f | %-10s |%n", 
            productId, productName, productPrice, stockQty, soldQty, profit, totalValue, availability);
    }
}
