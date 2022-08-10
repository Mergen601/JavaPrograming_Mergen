package day21_ArrayUtility;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {


        int num [] = {100,20,50,70,80};
        int num2 [] = Arrays.copyOf(num,1);

        System.out.println(Arrays.toString(num2));


        System.out.println("--------------------------------");

        String students [] = {"İhsan","Beyza","Tuğba","Bilgehan","Sıla"};
        String first3 [] = Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(first3));


        System.out.println("-------------------------------------");

        char[] ch1 = {'A','B','C','E'};
        char [] ch2 = Arrays.copyOfRange(ch1,0,3);
        System.out.println(Arrays.toString(ch2));

        System.out.println("-----------------------");

        int [] scores = {10,20,30,40,50,60,70,80,90,100};
        // index:        0 , 1, 2, 3, 4, 5, 6, 7, 8, 9
        int [] result = Arrays.copyOfRange(scores,3,10);
        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOf(scores,4);
        System.out.println(Arrays.toString(result2));












    }




}
