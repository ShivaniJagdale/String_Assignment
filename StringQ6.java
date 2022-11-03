//WAP to sort a String Alphabetically.
import java.util.Scanner;
public class StringQ6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str=sc.nextLine();
		char S[]=Str.toCharArray();
		char temp;
		for(int i=0;i<Str.length();i++)
		{
			for(int j=i+1;j<Str.length();j++)
			{
				if(S[i]>S[j])
		          {
					 temp=S[i];
					 S[i]=S[j];
					 S[j]=temp;
		          }	
			}
          
		}
		System.out.println("After Sorting");
		for(int i=0;i<S.length;i++)
		{	
		     System.out.print(S[i]);
		}
	}

}
