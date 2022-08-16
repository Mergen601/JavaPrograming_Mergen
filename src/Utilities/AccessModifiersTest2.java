package Utilities;

import day34_GarbageCollection_AccessModifiers.AccessesModifiers;

public class AccessModifiersTest2 {
    public static void main(String[] args) {

        System.out.println(AccessesModifiers.publicData);
        // System.out.println(AccessesModifiers.defaultData); only visible in the same package;
        // System.out.println(AccessesModifiers.privateData); only visible in the same class;
        AccessesModifiers.Method1();
       // AccessesModifiers.Method2(); //is only visible in the same package
       // AccessesModifiers.Method3(); // only visble in the same class

    }
}
