package day30_CustomClass;

public class Dog {



    public String name;
    public String breed;
    public int age;
    public String color;

    public char gender;
    public  String size;

    public void setInfo  (String dogName,String dogBreed,int dogAge,char dogGender,String dogSize, String dogColor)
    {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;

    }


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is braking");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                '}';
    }
}

