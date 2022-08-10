package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice
{
    public static void main(String[] args) {

        //1.create an array of string called countryNames

        //2.write a program that can remove all the country names have length of 10 or character

        String countryNames [] = {"NetherLand","United States","Turkey","Korea","Japan","Ukraine"};

        ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));
        countries.removeIf(p -> p.length()>=10);
        System.out.println(countries);

        countryNames = countries.toArray(new String[0]);
        System.out.println(Arrays.toString(countryNames));

    }
}
