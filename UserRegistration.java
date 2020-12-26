import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration
{

        public static void main(String[] args)
        {
                String fname,lname;
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
        }
}
