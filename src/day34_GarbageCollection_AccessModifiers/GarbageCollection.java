package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Car;
import day30_CustomClass.Dog;
import day32_Static.Iphone;

public class GarbageCollection {
    public static void main(String[] args) {

      /*  String str = null;
        System.out.println(str.toLowerCase());

       */

        String str = "Wooden Spoon";
        str = null;

        System.out.println(str);
        Car car1 = new Car();
        car1.setInfo("Toyota", "2018",2017,"Red",750);
        car1 = null;
        System.out.println(car1);


        System.out.println("------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "LUCY";

        dog1 = new Dog();
        dog1.name = "Max";
        new Dog();

        System.out.println(dog1);






    }
}
