//WAP to check if the String is a Pangram or not.
import java.util.Scanner;
public class StringQ4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str=sc.nextLine();
		String Str1="abcdefghijklmnopqrstuvwxyz";
		int count=0;
		for(int i=0;i<Str1.length();i++)
		{
			for(int j=0;j<Str.length();j++)
			{
			   if(Str1.charAt(i)==Str.charAt(j))
			   {
				   count++;
				   break;
			   }
			}	
		}
		if(count==26)
		{
			System.out.println("the String is a Pangram");
		}
		else
		{
			System.out.println("the String is not a Pangram");
		}
	}
}
