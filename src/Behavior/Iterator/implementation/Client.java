package Behavior.Iterator.implementation;

public class Client {
    public static void main(String[] args) {
        ArrayCollection array = new ArrayCollection(5);
        array.append(1);
        array.append(2);
        array.append(3);
        array.append(4);
        array.append(5);

        Iterator it = array.iterator();

        while (it.hasNext()) {
            System.out.printf("%s ->", it.Next());
        }
    }
}
