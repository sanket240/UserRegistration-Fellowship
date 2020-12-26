import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration
{
  public String NameValidation(String fname)
    {
            if(Pattern.matches("^[A-Z]{1}[a-z]{3,}",fname))
        {
            System.out.println("Valid First Name");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid First Name");
            return "SAD";
        }

    }

    public String LastNameValidation(String lname)
    {
        if(Pattern.matches("^[A-Z]{1}[a-z]{3,}",lname))
        {
            System.out.println("Valid Last Name");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid Last Name");
            return "SAD";
        }

    }

    public String EmailValidation(String email)
    {
        if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email))
        {
            System.out.println("Valid Email");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid Email");
            return "SAD";
        }

    }

    public String PhoneValidation(String phone)
    {
        if(Pattern.matches("^[0-9]{2} [0-9]{10}",phone))
        {
            System.out.println("Valid Phone");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid Phone");
            return "SAD";
        }

    }
    public String PasswordValidation(String password)
    {
        if(Pattern.matches("^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=]).{8,20}$",password))
        {
            System.out.println("Valid Password");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid Password");
            return "SAD";
        }

    }

 
}


