//WAP to count the number of Vowels and Consonants of a String value.
import java.util.Scanner;
public class StringQ7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String Str=sc.nextLine();
		char S[]=Str.toCharArray();
		int count_C=0,count_V=0;
		for(int i=0;i<S.length;i++)
		{
			if(S[i]=='A'||S[i]=='E'||S[i]=='I'||S[i]=='O'||S[i]=='U'||S[i]=='a'||S[i]=='e'||S[i]=='i'||S[i]=='o'||S[i]=='u')
			{
				count_V++;
			}
			else 
			{
				count_C++;
			}
		}
		System.out.println("number of Vowels:"+count_V);
		System.out.println("number of Consonants:"+count_C);
	}

}
