package day13_StringClass;


import java.util.Scanner;
import java.lang.String;

public class StringIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str =   "Wooden Spoon";
        String str2 = new String("Wooden Spoon");

        System.out.println(str.equals(str2));


    }
}
