package day36_Inheritance.encapsulation;

public class Student {

    private  String name;
    private  int age;
    private  char gender;
    private  char grade;

    private String schoolName;




    public Student(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName("Cydeo School");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>3) {
            this.name = name;
        }else{
            System.err.println("Invalid Name");
            System.exit(0);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>5 && age<50) {
            this.age = age;
        }else {
            System.err.println("Invalid age");
            System.exit(0);
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'F' || gender == 'M') {
            this.gender = gender;
        }else {
            System.err.println("Invalid gender");
            System.exit(0);
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade>='A' && grade<='D') {
            this.grade = grade;
        }else {
            System.err.println("Invalid Grade");
            System.exit(0);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void isPlaying () {
        System.out.println(getName()+" is playing");
    }

    public void isStudying(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
