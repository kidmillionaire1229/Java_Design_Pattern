package Structural.Composite.implementation;

public class Main {
    public static void main(String[] args) {
        Box box = new Box("Main Box");
        Product armor = new Product("Armor", 250);
        Product sword = new Product("Sword", 500);

        //box에 armore, sword 추가
        box.addComponent(armor);
        box.addComponent(sword);

        Box subBox = new Box("Sub Box");
        Product apple = new Product("Apple", 400);
        Product banana = new Product("Banana", 130);

        //subBox에 apple, banana 추가
        subBox.addComponent(apple);
        subBox.addComponent(banana);

        //box에 subBox 추가
        box.addComponent(subBox);

        Client client = new Client();

        /**getPrice 호출 순서
        Main Box
        Sub Box (Product banana , Product apple)
        Product (Product armor, Product sword)

         **/
        client.printPrice(box);
    }
}
