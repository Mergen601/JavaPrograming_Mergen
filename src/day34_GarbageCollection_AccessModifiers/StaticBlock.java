package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }

        static { //run first before anything, and only run one times
            System.out.println("Static Block");


        }
        static{ //run first before anything, and only run one times
            System.out.println("Static Block 2");
        }
        static { //run first before anything, and only run one times
            System.out.println("Static Block 3");
        }
    }

