package day34_GarbageCollection_AccessModifiers;

public class AccessesModifiers {

    public static int publicData = 10;
    static  int defaultData = 100; //access modifiers default;
    private static int privateData = 15; // private Access Modifiers;

    public static void Method1 ()
    {
        System.out.println("Method1");
    }

    static  void method2 ()
    {
        System.out.println("Method2");
    }
    private  void method3()
    {
        System.out.println("Method3");
    }
}
