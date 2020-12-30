import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistrationLambda
{
    @FunctionalInterface
    interface IMathFunction
    {
        boolean calc(String a,String b);
        static void printResult(String a,String b,String function,IMathFunction fobj) {
            System.out.println("Result of "+function+" is "+fobj.calc(a, b));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fname,lname,email,phone,pass;
        //First Name Validation
        IMathFunction firstName=(String a,String b)->(Pattern.matches(a,b));
        System.out.println("Enter First Name:");
        fname=sc.nextLine();
        IMathFunction.printResult("^[A-Z]{1}[a-z]{3,}",fname,"FirstNameValidation",firstName);
        //Last Name Validation
        IMathFunction lastName=(String a,String b)->(Pattern.matches(a,b));
        System.out.println("Enter Last Name:");
        lname=sc.nextLine();
        IMathFunction.printResult("^[A-Z]{1}[a-z]{3,}",lname,"LastNameValidation",lastName);
        // Email Validation
        IMathFunction email1=(String a,String b)->(Pattern.matches(a,b));
        System.out.println("Enter Email:");
        email=sc.nextLine();
        IMathFunction.printResult("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email,"EmailValidation",email1);
        // Phone Number Validation
        IMathFunction phoneNumber=(String a,String b)->(Pattern.matches(a,b));
        System.out.println("Enter Phone Number:");
        phone=sc.nextLine();
        IMathFunction.printResult("^[0-9]{2} [0-9]{10}",phone,"PhoneValidation",phoneNumber);
        // Password Validation
        IMathFunction password=(String a,String b)->(Pattern.matches(a,b));
        System.out.println("Enter Password:");
        pass=sc.nextLine();
        IMathFunction.printResult("^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=]).{8,20}$",pass,"PasswordValidation",password);
    }
}
