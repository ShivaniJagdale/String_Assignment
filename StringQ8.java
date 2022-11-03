//WAP to count number of special characters
import java.util.Scanner;
import java.util.regex.*;  
public class StringQ8 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str=sc.nextLine();
		char S[]=Str.toCharArray();
		int count=0;
        for(int i=0;i<Str.length();i++)
        {
        	if(S[i] >= 'a' && S[i] <= 'z' || S[i] >= 'A' && S[i] <= 'Z'||S[i] >= 'a' && S[i] <= 'z' || S[i] >= 'A' && S[i] <= 'Z'  )
        	{
        		
        	}
        	else
        	{
        		count++;
        	}
        }
        System.out.println("number of special characters are : "+count);
	}

}
