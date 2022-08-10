package day04_Variables;

public class Circle
{
    public static void main(String[] args)
    {
        //PI,RADİUS,DİAMETER,AREA,PERİMETER;

        double PI = 3.14;
        double radius =  5.5;
        double diameter = radius*2;
        double area=  radius*radius*PI;
        double perimeter = diameter *PI;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);


    }
}
