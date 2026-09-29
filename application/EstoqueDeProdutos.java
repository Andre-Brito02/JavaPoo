package application;
import entities.ProductsStock;

public class EstoqueDeProdutos {
    static void main() {
        ProductsStock product = new ProductsStock();

        IO.println("Enter product data:");
        product.name = IO.readln("Name: ");
        product.price = Double.parseDouble(IO.readln("Price: "));
        product.quantity = Integer.parseInt(IO.readln("Quantity: "));

        IO.println("\nProduct data: " + product + "\n");

        int quantity = Integer.parseInt(IO.readln("Enter the number of products to be added in stock: "));
        product.addProducts((quantity));
        IO.println("\nUpdated data: " + product + "\n");

        quantity = Integer.parseInt(IO.readln("Enter the number of products to be removed from stock: "));
        product.removeProducts((quantity));
        IO.println("\nUpdated data: " + product + "\n");
    }
}
