package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueChars {
    public static void main(String[] args) {

       String str = "aaaabbbbcccdfff";


        ArrayList<String>  unique= new ArrayList<>(Arrays.asList(str.split("")));
        unique.removeIf(p -> Collections.frequency(unique,p)>1);
        System.out.println(unique);



    }
}
