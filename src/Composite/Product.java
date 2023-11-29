package Composite;

public class Product implements Component {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    //Product는 Component 단일 객체이므로, price 변수 값을 반환
    @Override
    public int getPrice() {
        System.out.printf("name : %s , Class : %s, price : %d\n",this.name, this.getClass(), this.price);
        return price;
    }
}


