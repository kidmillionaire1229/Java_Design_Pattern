package Composite;

public class Client {
    public void printPrice(Component box){
        int totalPrice = box.getPrice();
        String line = String.format("Total price of %s: %d", box.getName(), box.getPrice());
        System.out.println("line = " + line);
    }
}
