package Behavior.Visitor;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }


    @Override
    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
}
