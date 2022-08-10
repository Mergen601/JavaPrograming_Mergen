package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char letter [] = new char [26];



        for (char i = 'A', j=0;  i<='Z' && j<letter.length; i++)
        {

            letter [j] =i;
            System.out.print(letter[j]+" ");

        }


        System.out.println("\n--------------------------------");

        for (char i = 'Z',j=0; i>='A'&& j< letter.length ; i--) {

            letter[j]=i;
            System.out.print(letter[j]+" ");


        }



    }
}
