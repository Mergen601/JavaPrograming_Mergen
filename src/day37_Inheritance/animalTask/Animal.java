package day37_Inheritance.animalTask;

public class Animal {

    public String name, breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public Animal (String name, String breed, int age, char gender, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;


    }










    public void eat()
    {
        System.out.println(name+ " is eating");
    }
    public void drink()
    {
        System.out.println(name+ " is drinking");
    }
    public void move()
    {
        System.out.println(name+ " is moving");
    }
    public void sleep()
    {
        System.out.println(name+ " is sleeping");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

