package day20_Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char alphabet [] = new char[26];

        for (char i = 'Z', j=0; i>='A' && j<alphabet.length ; i--)
        {
           alphabet [j] = i;
            System.out.print(alphabet[j]+" ");

        }

    }

}
