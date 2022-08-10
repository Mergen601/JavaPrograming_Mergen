package day24_CustomMethods_Return;

public class Test
{
    public static void main(String[] args) {


        String str = "aaaaabbbbbbccccdd";

        str = ReturnMethodPractice4.removeDuplicates(str); //abcd

        System.out.println(ReturnMethodIntro.Reverse(str));//dcba


        String name  = "Java Programing";
        name = ReturnMethodIntro.Reverse(name);
        System.out.println(name);
    }
}
