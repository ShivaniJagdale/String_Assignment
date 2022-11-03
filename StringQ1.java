//WAP to reverse a String.
import java.util.Scanner;
public class StringQ1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str=sc.nextLine();
		String Str1="";
		for(int i=Str.length()-1;i>=0;i--)
		{
			Str1=Str1+(char)Str.charAt(i);
		}
        System.out.println("reverse String:"+Str1);
	}

}
