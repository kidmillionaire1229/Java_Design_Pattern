package Adapter;

public class Adapter extends Service implements Target {

    private Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method(int data) {
        specificMethod(data);
    }
}
