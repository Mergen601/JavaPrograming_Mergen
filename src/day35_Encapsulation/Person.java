package day35_Encapsulation;

public class Person {
    String name;
    int age;
    char gender;
    public String language;

    public static String planet;
    static boolean isHuman , hasNose;
    public static int numberOfWings;
    public static int numberOfHeads;


    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;



    }

    static
    {
        planet = "Earth";
        isHuman = true;
        numberOfWings = 0;
        numberOfHeads = 1;

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet=" + planet +
                ", isHuman=" + isHuman +
                ", numberOfWings=" + numberOfWings +
                ", numberOfHeads=" + numberOfHeads +
                '}';
    }
}
