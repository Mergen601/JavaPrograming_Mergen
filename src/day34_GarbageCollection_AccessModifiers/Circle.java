package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {
    public static void main(String[] args) {



    }

    public double radius;
    public static double PI;

    public static String name = "Circle";

    public static ArrayList<Integer> numbers;


    public Circle(double radius)
    {
        this.radius = radius;
       // PI = 3.14;

    }
    static {    PI = 3.14;
                name = "Circle";
                numbers = new ArrayList<>();
                numbers.addAll(Arrays.asList(10,20,20));



                    System.out.println("PI = " + PI);
                    System.out.println("name = " + name);
                    System.out.println("numbers = " + numbers);

    }

}
