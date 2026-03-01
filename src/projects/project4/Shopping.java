package projects.project4;

public class Shopping {

    public static void main(String[] args) {
        User user = new User(new Cart());

        Product milk = new Product("Milk", 3.0);
        Product yogurt = new Product("Yogurt", 2.0);

        user.getCart().addProduct(milk, 3);
        user.getCart().showCart();
        user.getCart().addProduct(milk);
        user.getCart().showCart();
        user.getCart().addProduct(yogurt, 2);
        user.getCart().showCart();
    }
}
