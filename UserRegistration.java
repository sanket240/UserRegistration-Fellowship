import java.util.regex.Pattern;
public class UserRegistration {
    String message,name;
    public String NameValidation(String fname) throws InvalidUserDetailsException
    {
        try
        {
            if(Pattern.matches("^[A-Z]{1}[a-z]{3,}",fname))
            {
                System.out.println("Valid First Name");
                return "HAPPY";
            }
            else
                throw new  InvalidUserDetailsException("Invalid First Name");

        }
        catch (NullPointerException e)
        {

            throw new InvalidUserDetailsException("Invalid First Name");
        }
    }
    public String LastNameValidation(String lname) throws InvalidUserDetailsException
    {
        try {
            if(Pattern.matches("^[A-Z]{1}[a-z]{3,}",lname))
            {
                System.out.println("Valid Last Name");
                return "HAPPY";
            }
            else
                throw new  InvalidUserDetailsException("Invalid Last Name");

        }
        catch (NullPointerException e)
        {
            throw new InvalidUserDetailsException("Invalid Last Name");
        }
    }
    public String EmailValidation(String email) throws InvalidUserDetailsException
    {
        try
        {
            if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email))
            {
                System.out.println("Valid Email");
                return "HAPPY";
            }
            else
                throw new  InvalidUserDetailsException("Invalid Email");

        }
        catch (NullPointerException e)
        {
            throw new InvalidUserDetailsException("Invalid Email");
        }

    }
    public String PhoneValidation(String phone) throws InvalidUserDetailsException
    {
        try
        {
            if(Pattern.matches("^[0-9]{2} [0-9]{10}",phone))
            {
                System.out.println("Valid Phone");
                return "HAPPY";
            }
            else
                throw new  InvalidUserDetailsException("Invalid Phone");
        }
        catch (NullPointerException e)
        {
            throw new InvalidUserDetailsException("Invalid Phone");
        }
    }
    public String PasswordValidation(String password) throws InvalidUserDetailsException
    {
        try
        {
            if(Pattern.matches("^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=]).{8,20}$",password))
            {
                System.out.println("Valid Password");
                return "HAPPY";
            }
            else
                throw new  InvalidUserDetailsException("Invalid Password");

        }catch (NullPointerException e){
            throw new InvalidUserDetailsException("Invalid Password");
        }
    }