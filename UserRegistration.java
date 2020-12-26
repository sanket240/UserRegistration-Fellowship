import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration 
{
	
	public static void main(String[] args)
	{
		String fname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Last Name:");
		fname=sc.nextLine();
		if(Pattern.matches("^[A-Z]{1}[a-z]*{3,}",fname))
		{
			System.out.println("Valid First Name");
		}
		else
		{
			System.out.println("Invalid First Name");
		}
	}
}
