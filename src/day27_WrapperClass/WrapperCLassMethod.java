package day27_WrapperClass;

public class WrapperCLassMethod
{
    public static void main(String[] args) {
        String str = "123";
        int num =Integer.parseInt(str);
        System.out.println(num);

        System.out.println(num+1);
        System.out.println(str+1);

        System.out.println("-------------------------------");

        String str1 = "10.5";
        double num1 = Double.parseDouble(str1);
        System.out.println(num1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        System.out.println("----------------------");
        String isTrue = "True";
        Boolean isTrue1 = Boolean.parseBoolean(isTrue);
        System.out.println("isTrue1 = " + isTrue1);
    }
}
