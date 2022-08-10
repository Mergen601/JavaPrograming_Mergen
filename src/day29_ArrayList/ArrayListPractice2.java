package day29_ArrayList;

import day15_ForLoop.StartWithX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aeron","Ahmed","David","Shay"));

        employees.retainAll(Arrays.asList("Ahmed","David"));
        System.out.println(employees);

        System.out.println("---------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary","Mehra","Mehmet","Hasan","Beril","ihsan"));
        names.removeIf(p-> p.startsWith("M"));

        System.out.println(names);




    }
}
