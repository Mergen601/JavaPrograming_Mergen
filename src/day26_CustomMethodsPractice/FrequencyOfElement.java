package day26_CustomMethodsPractice;

import Utilities.ArrayUtilities;

public class FrequencyOfElement {


    public static void main(String[] args) {

        int arr [] = {10,1,1,1,2,3,4};
        String arr1 [] = {"AYŞE","ayşe","Ayşe","mehmet","ihsan","Enver"};


        int frequencyOfElement = ArrayUtilities.frequencyOfElement(arr,1);
        System.out.println(frequencyOfElement);

        int frequencyOfString = ArrayUtilities.frequencyOfElement(arr1,"Mehmet");


    }


}
