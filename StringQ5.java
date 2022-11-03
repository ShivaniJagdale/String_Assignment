import java.util.Scanner;

public class StringQ5 {
	public static void main(String[] args) 
	{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the String:");
			StringBuffer Str=new StringBuffer(sc.nextLine());
		    char a;
			int count=0;
			boolean flag=false;
			System.out.println("Repeatedly occurring characters in the given String are:");
			for(int i=0;i<Str.length();i++)
			{
				count=0;
				a=Str.charAt(i);
				for(int j=0;j<Str.length();j++)
				{
					if(a==Str.charAt(j))
					{
						count++;
						if(count>1)
						{
							flag=true;
							System.out.println(Str.charAt(i));
							Str.deleteCharAt(i);
							break;
					    }
					}
					
				}
				
			}
			if(flag==false) 
			{
				System.out.println("0");
			}
		}

}
