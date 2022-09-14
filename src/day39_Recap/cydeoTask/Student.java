package day39_Recap.cydeoTask;

public class Student extends  Person{

    private int studentId;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Name= "+getName()+
                ", Age= "+getAge()+
                ", gender= "+getGender()+
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
