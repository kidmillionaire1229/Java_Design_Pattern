package Behavior.Observer;

public class KoreanUser implements Subscriber{
    public String name;

    public KoreanUser(String name) {
        this.name = name;
    }


    @Override
    public void display(Publisher publisher) {
        System.out.printf("%s님이 현재 날씨를 조회함\n",this.name);
        System.out.println("Changed Information = " + publisher.toString());
    }

}
