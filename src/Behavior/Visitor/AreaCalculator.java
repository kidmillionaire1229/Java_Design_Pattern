package Behavior.Visitor;

/**
 * Concrete Visitor
 * 기존의 ConcreteElement에 기능을 추가하지 않고, Visitor을 구현한 구체클래스에서 구현하게끔 한다.
 */
public class AreaCalculator implements ShapeVisitor{

    @Override
    public double visit(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double visit(Triangle triangle) {
        double s = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
        return Math.sqrt(s * (s - triangle.getSideA()) * (s - triangle.getSideB()))
                * (s - triangle.getSideC());
    }

    @Override
    public double visit(Rectangle rectangle) {
        return 0;
    }
}
