package Behavior.Mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Component user1 = new Component(mediator, "A");
        Component user2 = new Component(mediator, "B");
        Component user3 = new Component(mediator, "C");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello World");
        user2.send("Who are you");
    }
}
