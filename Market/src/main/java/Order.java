import java.util.List;

public class Order {
    private final List<Product> products;
    private final double totalPrice;

    public Order(List<Product> products, double totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
