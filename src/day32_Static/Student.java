package day32_Static;

public class Student {

    public String name;
    public char gender;
    public int studentID;
    public char grade;
    public int age;


    public Student(String name)
    {
        this.name = name;
    }

    public Student(String name,char gender)
    {
        this.name = name;
        this.gender = gender;
    }

    public Student(String name, int studentID,char grade)
    {
        this.name = name;
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student(String name, char gender, int studentID, char grade, int age) {
        this.name = name;
        this.gender = gender;
        this.studentID = studentID;
        this.grade = grade;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", studentID=" + studentID +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}


