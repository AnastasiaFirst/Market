import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CartTest {

    @Test
    public void testAddProduct() {
        Cart cart = new Cart();
        Product product = new Product("Яблоко", 0.5);
        cart.addProduct(product);
        assertEquals(1, cart.getProducts().size());
        assertTrue(cart.getProducts().contains(product));
    }

    @Test
    public void testRemoveProduct() {
        Cart cart = new Cart();
        Product product = new Product("Яблоко", 0.5);
        cart.addProduct(product);
        cart.removeProduct(product);
        assertEquals(0, cart.getProducts().size());
    }

    @Test
    public void testGetTotalPrice() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Яблоко", 0.5));
        cart.addProduct(new Product("Хлеб", 1.0));
        assertEquals(1.5, cart.getTotalPrice());
    }
}