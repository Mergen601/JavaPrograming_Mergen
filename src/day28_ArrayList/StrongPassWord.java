package day28_ArrayList;

public class StrongPassWord {
    public static void main(String[] args) {


        String password = "Cydeo1990";

        boolean  r1  =  password.length() >=8 && !password.contains(" ");
        boolean  r2  = false; // hasUpperCase
        boolean  r3 =  false; // hasLowerCase
        boolean  r4 =  false; // hasDigit
        boolean  r5 =  false; // hasSpecialChars

        char arr [ ] = password.toCharArray();


        for(char each : arr)
        {
            if(Character.isUpperCase(each))
            {
                r2 = true;
            }
            else if(Character.isLowerCase(each))
            {
                r3 = true;
            }
            else  if(Character.isDigit(each))
            {
                r4 = true;
            }
            else
            {
                r5 =true;
            }
        }


        Boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);

    }




}
