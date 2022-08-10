package day21_ArrayUtility;

import java.util.Arrays;

public class MergeTwoArrays
{
    public static void main(String[] args) {

        String group1 [] = {"Ali","Laya","Aysenur"};
        String group2 [] = {"Aria","Aygun","Duygu","Suat","Valeriy"};

        String students [] = new String[group1.length+group2.length];//8

         int i =0;
         for(String each : group1)
         {
             students [i++] = each;// 0 1 2

         }
         for(String each : group2)
         {

             students [i++] = each;// 0 1 2 3 4

         }


        System.out.println(Arrays.toString(students));


        System.out.println("-------------------------------");

        char ch1 [] = {'A','B','C'};
        char ch2 [] = {'D','E','F'};
        char alphabet []  =new char[ch1.length+ ch2.length]; // 6


        for(int j= 0,i1=0; j<=alphabet.length-1; j+=2,i1++)
        {

             alphabet [j]= ch1[i1];
        }


        for(int j= 1,i1=0; j<=alphabet.length-1; j+=2,i1++)
        {

            alphabet [j]= ch2[i1];
        }

        System.out.println(Arrays.toString(alphabet));



    }
}
