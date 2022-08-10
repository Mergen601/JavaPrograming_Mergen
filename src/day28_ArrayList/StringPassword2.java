package day28_ArrayList;

public class StringPassword2
{
    public static void main(String[] args) {

        String password = "İhsan";

        boolean validPassword  = password.length()>=8 && !password.contains(" ");

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecial = 0;

        for (int i = 0; i <password.length() ; i++)
        {

            char each = password.charAt(i);

            if(Character.isUpperCase(each))
            {
                countUpperCase++;
            }
            else if(Character.isLowerCase(each))
            {
                countLowerCase++;
            }
            else  if(Character.isDigit(each))
            {
                countDigit++;
            }
            else
            {
                countSpecial++;
            }
        }

        boolean hasUpperCase  = countUpperCase>0;
        boolean hasLowerCase  = countLowerCase>0;
        boolean hasDigit      = countDigit>0;
        boolean hasSpecial    = countSpecial>0;

        boolean isStrongPassword = hasUpperCase && hasLowerCase && hasDigit && hasDigit;
        System.out.println("isStrongPassword = " + isStrongPassword);


    }
}
