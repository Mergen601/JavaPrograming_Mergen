package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers  = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(2);
        numbers.add(0,100);
        System.out.println("numbers = " + numbers);

        System.out.println("--------------------------------");

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);


        System.out.println("--------------------------------");

        int getNumber =  numbers.get(0);
        System.out.println("getNumber = " + getNumber);

        System.out.println("-------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
            
        }

        System.out.println("\n-------------------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Beyza");
        list.add("İhsan");
        list.add("Ahmet");
        list.add("Mehmet");
        System.out.println("list = " + list);
        list.set(2,"Beyza");
        System.out.println(list);

        System.out.println("-----------------------------------");

        ArrayList<String>employee = new ArrayList<>();
        employee.add("Fatih");
        employee.add("Salim");
        employee.add("Semih");
        employee.add("Soner");
        employee.add("Ali");
        System.out.println(employee);


        boolean r1  = employee.remove("Ali");
        System.out.println(r1);

        boolean r2 = employee.remove("ALİ");
        System.out.println(r2);


    }
}
