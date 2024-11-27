public class OrderService {
    public Order createOrder(Cart cart) {
        double totalPrice = cart.getTotalPrice();
        if (totalPrice == 0) {
            throw new IllegalArgumentException("Корзина пустая, нельзя создать заказ");
        }
        return new Order(cart.getProducts(), totalPrice);
    }
}
