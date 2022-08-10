package day27_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int n1 = 200;
        Integer n2 = n1;//autoboxing

        Integer n3 = 300;
        int num1 = n3;// unboxing
        System.out.println();
        System.out.println("-----------------------------------");

        Integer integerValue = 200;
        long longValue = integerValue;

        System.out.println("--------------------------------------");

        Integer z = 200;
        Integer y = z;

        System.out.println("-------------------------------------");

        int arr [] = {1,2,2,3,4,5};
        Integer arr1 []  ={1,2,2,3,4,5};
    }
}
