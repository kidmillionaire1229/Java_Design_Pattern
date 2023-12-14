package Behavior.Strategy.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Context
 * : Strategy를 참조, Strategy의 메소드를 호출하여, 전략에 따라 동작하게 함
 */
public class ShoppingCart {
    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        int amount = 0;
        for (Item item : items) {
            amount += item.getPrice();
        }
        this.paymentStrategy.pay(amount);
    }
}
