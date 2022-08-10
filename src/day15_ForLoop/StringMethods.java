package day15_ForLoop;

public class StringMethods
{
    public static void main(String[] args)
    {
        String str = "  ";
        Boolean valid = str.isEmpty();

        System.out.println(valid);

        System.out.println("-------------------------");
        String str1 = "";
        Boolean r = str1.isBlank();
        System.out.println(r);

        String j = "java";
        String j2 = "JAVA";

        boolean isEqual = j.equalsIgnoreCase(j2);
        System.out.println("isEqual = " + isEqual);

        System.out.println("Yes".equalsIgnoreCase("YEs"));//true
        System.out.println("********************************************");

        String sentence =  "My favorite programing language is Java";
        boolean hasCsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasjava = sentence.toLowerCase().contains("java");
        System.out.println(hasCsharp);
        System.out.println(hasjava);
        System.out.println("hasJava = " + hasJava);

        boolean startWith = sentence.startsWith("M");
        boolean endWith = sentence.toLowerCase().endsWith("a");
        System.out.println("endWith = " + endWith);



    }
}
