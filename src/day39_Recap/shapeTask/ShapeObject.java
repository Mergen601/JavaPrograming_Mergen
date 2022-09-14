package day39_Recap.shapeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObject {
    public static void main(String[] args) {

        Rectangle  rectangle = new Rectangle(4,2);
        System.out.println("rectangle.area() = " + rectangle.area());
        Circle circle = new Circle(1.3);
        System.out.println("circle.area() = " + circle.area());

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.addAll(Arrays.asList(rectangle,circle));
        System.out.println(shapes);
        shapes.removeIf(p ->  p.getName().equals("Circle"));
        System.out.println(shapes);


    }
}
