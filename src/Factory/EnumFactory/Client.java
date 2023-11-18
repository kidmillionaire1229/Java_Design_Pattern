package Factory.EnumFactory;

public class Client {

    public static void main(String[] args) {
        Season summer = Season.SUMMER;

        System.out.println("summer.name() = " + summer.name());
        System.out.println("summer.getSeason() = " + summer.getSeason());

        System.out.println("--Enum Factory Method Pattern --");
        //팩토리 객체를 외부에서 만들 필요가 없다.

        Shape redRectangle = EnumShapeFactory.RECTANGLE.create("red");
        System.out.println("red Rectangle = " + redRectangle);

        Shape yellowCirlce = EnumShapeFactory.CIRCLE.create("yellow");
        System.out.println("yellowCirlce = " + yellowCirlce);

    }
}
