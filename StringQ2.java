// WAP to reverse a sentence while preserving the position.
import java.util.Scanner;
public class StringQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String Str=sc.nextLine();
		String S[]=Str.split(" ");
		String Str1="";
		System.out.println("Reverse of the Sentence:");
		for(int i=0;i<=S.length-1;i++)
		{
			for(int j=S[i].length()-1;j>=0;j--)
			{	
				   Str1=Str1+(char)S[i].charAt(j);
			}
			Str1=Str1+" ";
		}
		System.out.println(Str1.toLowerCase());
			
	}

}
