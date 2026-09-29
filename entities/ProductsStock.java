package entities;

import java.util.Locale;

public class ProductsStock {
    public String name;
    public double price;
    public int quantity;

    public ProductsStock(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name.toUpperCase(Locale.ROOT) + ", " +
                "$ %.2f".formatted(price) +
                ", " + quantity + " units, " +
                "Total: $ %.2f".formatted(totalValueInStock());
    }
}
