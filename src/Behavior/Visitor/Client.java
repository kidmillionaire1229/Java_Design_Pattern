package Behavior.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Triangle(2,4,5));
        shapes.add(new Rectangle(3,5 ));

        double totalArea = 0.0;
        ShapeVisitor visitor = new AreaCalculator();

        for (Shape shape : shapes) {
            totalArea += shape.accept(visitor);
        }

        System.out.println("totalArea = " + totalArea);;
    }
}
