package day35_Encapsulation;

public class CydeoStudent {

    public String nameOfStudent;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programingLanguage;



    static
    {
        schoolName = "Cydeo School";
        programingLanguage = "Java";
    }


    public String toString() {
        return "CydeoStudent{" +
                "nameOfSchool='" + schoolName + '\'' +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
