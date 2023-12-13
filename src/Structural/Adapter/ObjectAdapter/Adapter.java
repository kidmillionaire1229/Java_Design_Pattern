package Structural.Adapter.ObjectAdapter;

public class Adapter implements Target {
    Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method(int data) {
        //adaptee에게 메소드 행위 위임
        adaptee.specificMethod(data);
    }
}
