package day14_String;

public class StringMethods1
{
    public static void main(String[] args)
    {
        String str = "      Hi Cydeo     ";
        str = str.trim();
        System.out.println(str);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2);
        int n3 = str2.indexOf("ool");
        System.out.println("n3 = " + n3);

        String str3 = "Java Programing Language";
        int n4 = str3.indexOf("ami");
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("ang");
        System.out.println("n5 = " + n5);

        int n6 = str3.indexOf("Lan");
        System.out.println("n6 = " + n6);

        int n7 = str3.lastIndexOf("g");
        System.out.println("n7 = " + n7);

        System.out.println("----------------------------------");
        String  s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("ova");

        System.out.println("firstA = " + firstA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("lastA = " + lastA);
        s= s.toUpperCase();
        System.out.println("s = " + s);
        s= s.toLowerCase();
        System.out.println("s = " + s);



    }
}
