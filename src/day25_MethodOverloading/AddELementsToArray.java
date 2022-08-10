package day25_MethodOverloading;

import java.util.Arrays;

public class AddELementsToArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        arr = addElement(arr, 10);
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------");

        double arr1[] = {1.2,3.4,5,6,8.8};
        arr1 = addElement(arr1,5.5);
        System.out.println(Arrays.toString(arr1));

        System.out.println("--------------------------------");

        String arr2[] = {"Beyza","İhsan","Ahmet","Mehmet"};
        arr2 = addElement(arr2,"Jackson");
        System.out.println(Arrays.toString(arr2));

        System.out.println("--------------------------------");

        char arr3 [] = {'A','B','C','D','E','F'};
        arr3 = addElement(arr3,'G');
        System.out.println(Arrays.toString(arr3));



    }

    public static int[] addElement(int arr[], int element) //add element to array
    {
        int result[] = new int[arr.length + 1];

        int i = 0;
        for (int each : arr) {
            result[i] = each;
            i++;
        }

        result[i] = element;

        return result;


    }

    public static double[] addElement(double arr[], double element) //add double to array
    {
        double result[] = new double[arr.length + 1];

        int i = 0;
        for (double each : arr) {
            result[i] = each;
            i++;
        }

        result[i] = element;

        return result;
    }

    public static String[] addElement(String arr[], String element) //add String to array
    {
        String result[] = new String[arr.length + 1];

        int i = 0;
        for (String each : arr) {
            result[i] = each;
            i++;
        }

        result[i] = element;

        return result;
    }

    public static char[] addElement(char arr[], char element) //add char to array
    {
        char result[] = new char[arr.length + 1];

        int i = 0;
        for (char each : arr) {
            result[i] = each;
            i++;
        }

        result[i] = element;

        return result;
    }




}
