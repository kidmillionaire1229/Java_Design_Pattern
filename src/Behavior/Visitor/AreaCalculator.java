package Behavior.Visitor;

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
