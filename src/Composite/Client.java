package Composite;

public class Client {
    public void printPrice(Component box){
        System.out.printf("Total price of %s: %d", box.getName(), box.getPrice());
    }
}
