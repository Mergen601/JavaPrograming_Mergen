package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject
{
    public static void main(String[] args) {

     Dog dog1 = new Dog();
     dog1.name = "ChoCho";
     dog1.age = 18;
     dog1.color = "red";
     dog1.gender = 'F';
     dog1.breed = "HUSKY";


     Dog dog2  = new Dog();
     dog2.name = "Mergen";
     dog2.age = 12;
     dog2.color = "red";
     dog2.breed = "HUSKY";
     dog2.gender = 'M';
     dog2.size = "Big";

     Dog dog3 = new Dog();
     dog3.setInfo("dogo","Husky",18,'F',"Small","white");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        dog3.eat();

     Dog dog4 = new Dog();
     dog4.setInfo("alex","TOGO",12,'M',"Small","Black");

     Dog dog5 = new Dog();
     dog5.setInfo("Cem","wolf",10,'F',"Big","Purple");

        System.out.println("----------------------------------------------");

        ArrayList<Dog> malesDog = new ArrayList<>();
        malesDog.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        malesDog.removeIf(p -> p.gender=='F');

        ArrayList<Dog> femalesDog = new ArrayList<>();
        femalesDog.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        femalesDog.removeIf(p-> p.gender=='M');



        for(Dog each : malesDog)
        {
            System.out.println(each.name+ " : " +each.gender);
        }

        System.out.println("-----------------------------------");

        for(Dog each : femalesDog)
        {
            System.out.println(each.name+ " : " +each.gender);
        }





    }
}
