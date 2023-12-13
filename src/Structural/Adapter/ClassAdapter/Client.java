package Structural.Adapter.ClassAdapter;

public class Client {

    public static void main(String[] args) {
        //객체 어댑터 타입과 다르게, Service Class를 상속받기 때문에, Adapter의 생성자 주입이 필요 없다. 
        Target target = new Adapter();
        target.method(1);
    }
}
