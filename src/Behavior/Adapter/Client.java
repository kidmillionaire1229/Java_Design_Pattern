package Behavior.Adapter;

public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter(new Service());
        adapter.method(1);
    }
}
