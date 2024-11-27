public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 0.5);
        Product bread = new Product("Хлеб", 1.0);
        Product milk = new Product("Молоко", 1.5);

        User user = new User("Иван");

        // Добавление товаров в корзину
        user.getCart().addProduct(apple);
        user.getCart().addProduct(bread);
        user.getCart().addProduct(milk);

        // Создание заказа
        OrderService orderService = new OrderService();
        Order order = orderService.createOrder(user.getCart());

        // Вывод информации о заказе
        System.out.println("Заказ пользователя: " + user.getName());
        System.out.println("Товары в заказе:");
        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName() + ": " + product.getPrice() + " руб.");
        }
        System.out.println("Итоговая цена: " + order.getTotalPrice() + " руб.");
    }
}
