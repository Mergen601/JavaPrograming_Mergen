package Utilities;

import java.util.Arrays;

public class ArrayUtilities {
    //print each integer in separated lines
    public static void printEach(int arr[]) {
        for (int each : arr) {
            System.out.println(each);
        }
    }

    //print each double in separated lines
    public static void printEach(double arr[]) {
        for (double each : arr) {
            System.out.println(each);
        }
    }

    //print each char array in separated line
    public static void printEach(char arr[]) {
        for (char each : arr) {
            System.out.println(each);
        }
    }

    //print each string array in separated line
    public static void printEach(String arr[]) {
        for (String each : arr) {
            System.out.println(each);
        }
    }

    //Find Max number from the Array
    public static int maxNumber(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //Find Max number from the Array
    public static double maxNumber(double arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //Find minimum number from the Array
    public static int minimumNumber(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    //Find minimum number from the Array
    public static double minimumNumber(double arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    //check if the given integer is contained in the given array, returns boolean;
    public static boolean contains(int arr[], int number) {
        boolean result = false;

        for (int each : arr) {
            if (each == number) {

                result = true;

            }

        }
        return result;
    }

    //check if the given double is contained in the given array, returns boolean;
    public static boolean contains(double arr[], double number) {
        boolean result = false;

        for (double each : arr) {
            if (each == number) {

                result = true;

            }

        }
        return result;
    }


    //--------------------frequencyOfElement----------------------------//


    // returns frequency of the element from given array
    public static int frequencyOfElement(int arr[], int element) {
        int frequency = 0;
        for (int each : arr) {
            if (element == each) {
                frequency++;
            }
        }


        return frequency;
    }

    // returns frequency of the double element from given array
    public static int frequencyOfElement(double arr[], double element) {
        int frequency = 0;
        for (double each : arr) {
            if (element == each) {
                frequency++;
            }
        }


        return frequency;
    }

    // returns frequency of the char element from given array
    public static int frequencyOfElement(char arr[], char element) {
        int frequency = 0;
        for (char each : arr) {
            if (element == each) {
                frequency++;
            }
        }


        return frequency;
    }

    // returns frequency of the String element from given array
    public static int frequencyOfElement(String arr[], String element) {
        int frequency = 0;
        for (String each : arr) {
            if (element.equalsIgnoreCase(each)) {
                frequency++;
            }
        }


        return frequency;
    }

    //----------------------------addElement-----------------------------------//

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

    //------------------------UniqueElements-------------------------------//

    //returns unique element from the integer array
    public static int[] UniqueElement(int arr[]) {
        int result[] = {};
        for (int each : arr) {
            if (ArrayUtilities.frequencyOfElement(arr, each) == 1) {
                result = ArrayUtilities.addElement(result, each);

            }


        }

        return result;
    }

    //returns unique element from the double array
    public static double[] UniqueElement(double arr[]) {
        double result[] = {};
        for (double each : arr) {
            if (ArrayUtilities.frequencyOfElement(arr, each) == 1) {
                result = ArrayUtilities.addElement(result, each);

            }


        }

        return result;
    }

    //returns unique element from the string array
    public static String[] UniqueElement(String arr[]) {
        String result[] = {};
        for (String each : arr) {
            if (ArrayUtilities.frequencyOfElement(arr, each) == 1) {
                result = ArrayUtilities.addElement(result, each);

            }


        }

        return result;
    }

    //returns unique element from the char array
    public static char[] UniqueElement(char arr[]) {
        char result[] = {};
        for (char each : arr) {
            if (ArrayUtilities.frequencyOfElement(arr, each) == 1) {
                result = ArrayUtilities.addElement(result, each);

            }


        }

        return result;
    }


    //-----------------------RemoveElement-------------------------------//


    // remove double index from the arrays
    public static double[] removeElement(double arr[], int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }


        double result[] = {};

        for (int i = 0; i < arr.length - 1; i++) {
            if (i != index) {

                result = ArrayUtilities.addElement(result, arr[i]);

            }
        }

        return result;

    }

    // remove integer index from the arrays
    public static int[] removeElement(int arr[], int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }


        int result[] = {};

        for (int i = 0; i < arr.length - 1; i++) {
            if (i != index) {

                result = ArrayUtilities.addElement(result, arr[i]);

            }
        }

        return result;

    }

    // remove char index from the arrays
    public static char[] removeElement(char arr[], int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }


        char result[] = {};

        for (int i = 0; i < arr.length - 1; i++) {
            if (i != index) {

                result = ArrayUtilities.addElement(result, arr[i]);

            }
        }

        return result;

    }

    // remove String index from the arrays
    public static String[] removeElement(String arr[], int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);
        }


        String result[] = {};

        for (int i = 0; i < arr.length - 1; i++) {
            if (i != index) {

                result = ArrayUtilities.addElement(result, arr[i]);

            }
        }

        return result;

    }


    //--------------------------MergeTwoArrays-------------------------//

    //merge two arrays
    public static int[] mergeArrays(int arr1[], int arr2[]) {
        int result[] = {};

        for (int each : arr1) {
            result = addElement(result, each);
        }

        for (int each : arr2) {

            result = addElement(result, each);

        }


        return result;

    }

    public static double[] mergeArrays(double arr1[], double arr2[]) {
        double result[] = {};

        for (double each : arr1) {
            result = addElement(result, each);
        }

        for (double each : arr2) {

            result = addElement(result, each);

        }


        return result;

    }

    public static char[] mergeArrays(char arr1[], char arr2[]) {
        char result[] = {};

        for (char each : arr1) {
            result = addElement(result, each);
        }

        for (char each : arr2) {

            result = addElement(result, each);

        }


        return result;

    }

    public static String[] mergeArrays(String arr1[], String arr2[]) {
        String result[] = {};

        for (String each : arr1) {
            result = addElement(result, each);
        }

        for (String each : arr2) {

            result = addElement(result, each);

        }


        return result;

    }

    //--------------------------Reverse---------------------------------//

    public static int[] reverse(int arr[]) {
        int result[] = {};

        for (int i = arr.length - 1; i >= 0; i--) {

            result = ArrayUtilities.addElement(result, arr[i]);
        }

        return result;
    }






    //-------------------------Replace-----------------------------//
    public static int [] replaceElement (int arr [],int index, int newElement)
    {
        if(index<0 || index> arr.length-1)
        {
            System.err.println("Invalid Index");
            System.exit(0);
        }
        arr [index] = newElement;
        return  arr;

    }

    public static double [] replaceElement (double arr [],int index, double newElement)
    {
        if(index<0 || index> arr.length-1)
        {
            System.err.println("Invalid index");
            System.exit(0);
        }
        arr [index] = newElement;
        return  arr;

    }

    public static char [] replaceElement (char arr [],int index, char newElement)
    {
        if(index<0 || index> arr.length-1)
        {
            System.err.println("Invalid index");
            System.exit(0);
        }
        arr [index] = newElement;
        return  arr;

    }

    public static  String [] replaceElement ( String arr [],int index,  String newElement)
    {
        if(index<0 || index> arr.length-1)
        {
            System.err.println("Invalid index");
            System.exit(0);
        }
        arr [index] = newElement;
        return  arr;

    }


    //------------------------replaceALL----------------------------------------------//
    public static int [] replaceAll(int arr [],int element,int newELement)
    {
        int i=0;
        for (int each : arr)
        {
            if(each==element)
            {
                arr[i] = newELement;
            }

            i++;
        }

        return arr;
    }

    public static double[] replaceAll(double arr [],double element,double newELement)
    {
        int i=0;
        for (double each : arr)
        {
            if(each==element)
            {
                arr[i] = newELement;
            }

            i++;
        }

        return arr;
    }

    public static char[] replaceAll(char arr [],char element,char newELement)
    {
        int i=0;
        for (char each : arr)
        {
            if(each==element)
            {
                arr[i] = newELement;
            }

            i++;
        }

        return arr;
    }


    //-------------------------------removeDuplicates------------------------------------//
    public static int [] removeDuplicates  (int arr[])
    {
        int result [] = {};


        for (int each: arr)
        {
            if(!ArrayUtilities.contains(result,each))
            {
                result = ArrayUtilities.addElement(result,each);

            }


        }
        return result;
    }

}






