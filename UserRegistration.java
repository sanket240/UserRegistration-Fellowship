import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration
{

        public static void main(String[] args)
        {
                String fname,lname,email,mobile,password;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter First Name:");
                fname=sc.nextLine();
                if(Pattern.matches("^[A-Z]{1}[a-z]*{3,}",fname))
                {
                        System.out.println("Valid First Name");
                }
                else
                {
                        System.out.println("Invalid First Name");
                }
                System.out.println("Enter Last Name:");
                lname=sc.nextLine();
                if(Pattern.matches("^[A-Z]{1}[a-z]*{3,}",lname))
                {
                        System.out.println("Valid Last Name");
                }
                else
                {
                        System.out.println("Invalid Last Name");
                }
		System.out.println("Enter Email:");
		email=sc.nextLine();
		if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email))
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Invalid Email");
		}
		System.out.println("Enter Mobile:");
		mobile=sc.nextLine();
		if(Pattern.matches("^[0-9]{2} [0-9]{10}",mobile))
		{
			System.out.println("Valid Mobile Number");
		}
		else
		{
			System.out.println("Invalid Mobile Number");
		}
		System.out.println("Enter Password:");
		password=sc.nextLine();
		if(Pattern.matches("^(?=.*[A-Z])"+"(?=.*[0-9]).{8,32}$",password))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
        }
}
