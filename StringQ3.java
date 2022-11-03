//WAP to check if the String is Anagram or not.
import java.util.Scanner;
public class StringQ3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String1:");
		StringBuffer Str1=new StringBuffer(sc.nextLine());
		System.out.println("Enter the String2:");
		StringBuffer Str2=new StringBuffer(sc.nextLine());
		int count=0;
		if(Str1.length()==Str2.length())
		{	
		 for(int i=0;i<Str1.length();i++)
		 {
			 for(int j=0;j<Str2.length();j++)
			 {	 
			  if(Str1.charAt(i)==Str2.charAt(j))
			  {
				  count++;
				  Str2.deleteCharAt(j);
			  }
			  
			 }		  
	     }
		 if(count==Str1.length())
			{
				System.out.println("Anagram");
			}
		 else
		 {
			 System.out.println("not an Anagram");
		 }
		}
		else
		{
			System.out.println("not an anagram");
		}
		
	}

}
