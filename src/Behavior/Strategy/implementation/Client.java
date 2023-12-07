package Behavior.Strategy.implementation;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Macbook Pro", 10000));
        cart.addItem(new Item("Iphone",2000));

        cart.setPaymentStrategy(new MasterCardStrategy("Kanye","1234","111"));
        cart.pay();

        cart.setPaymentStrategy(new MobilePayStrategy("minjun@soongsil.ac.kr","12345"));
        cart.pay();
    }
}
