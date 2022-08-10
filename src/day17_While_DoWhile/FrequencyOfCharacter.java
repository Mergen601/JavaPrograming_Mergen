package day17_While_DoWhile;



public class FrequencyOfCharacter
{
    public static void main(String[] args) {



        String str = "AAAAAABBBBAAAA";


        char ch = 'A';
        int frequency =  0;

        for(int i=0; i<str.length();i++)
        {
           char chr = str.charAt(i);


           if(ch ==chr)
           {

               frequency++;

           }
        }
        System.out.println("frequency = " + frequency);







    }
}
