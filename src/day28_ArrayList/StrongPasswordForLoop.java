package day28_ArrayList;

public class StrongPasswordForLoop
{
    public static void main(String[] args) {
        String password = "ihsanEnver/601";

        boolean r1  = password.length()>=8 && !password.contains(" ");
        boolean r2 = false;// hasUpperCase
        boolean r3 = false;// hasLowerCase
        boolean r4 = false;// hasDigit
        boolean r5 = false;// hasSpecialChars


        for(int i = 0; i<password.length();i++)
        {
            char each = password.charAt(i);
            if(Character.isUpperCase(each))
            {
                r2 = true;
            }
            else if(Character.isLowerCase(each))
            {
                r3  = true;
            }
            else if(Character.isDigit(each))
            {
                r4 = true;
            }
            else
            {
                r5 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);



    }
}
