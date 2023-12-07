package Behavior.Visitor;

public interface Shape {
    double accept(ShapeVisitor visitor);
}
