package Structural.Adapter.ObjectAdapter;

public class Client {

    public static void main(String[] args) {
        //Client에서 Service 클래스를 직접 사용이 불가능함.
        //adapter에게 주입 후, adapter에서 Service를 호출하게 끔 함 
        Target adapter = new Adapter(new Service());
        adapter.method(1);
    }
}
