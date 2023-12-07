package Behavior.Visitor;

public interface ShapeVisitor {
    double visit(Circle circle);
    double visit(Triangle triangle);
    double visit(Rectangle rectangle);
}
