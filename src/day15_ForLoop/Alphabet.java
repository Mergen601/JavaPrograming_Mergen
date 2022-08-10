package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for(int i=65; i<=90; i++)
        {
            System.out.println((char) i);
        }

        System.out.println("*************************");

        for(char i = 'A'; i<= 'Z'; i++ )
        {
            System.out.println(i);
        }

        System.out.println("****************************");

        for(char i = 'a'; i<='z';i++)
        {
            System.out.println(i);
        }

        System.out.println("********************************");

        for(char i = 'Z'; i>='A';i--)
        {
            System.out.println(i);
        }
    }
}
