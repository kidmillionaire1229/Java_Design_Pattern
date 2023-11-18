package Flyweight;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "red", fontFactory.getFont("Nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("Nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("Nanum:12"));
        //Character c4 = new Character('l', "blue", "Nanum", 12);
        //Character c5 = new Character('o', "white", "Nanum", 12);
        System.out.println("c1.toString() = " + c1.toString());
        System.out.println("c2.toString() = " + c2.toString());
        System.out.println("c3.toString() = " + c3.toString());
    }

}
