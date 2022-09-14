package day39_Recap.shapeTask;

import day37_Inheritance.phoneTask.Phone;

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


        Rectangle rectangle1 = new Rectangle(-10,22);
        System.out.println(rectangle1);



        Square square = new Square(10);
        System.out.println(square);

        for(Shape each : shapes)
        {
            System.out.println(each.getName() +": "+each.area());
        }



    }
}
