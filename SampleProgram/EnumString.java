package SampleProgram;

import java.util.Scanner;

enum Capital
{
	ABC,
	DEG,
	TGH,
}	
public class EnumString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter the token");
			String token=sc.nextLine();
			try
			{
				Capital value = Capital.valueOf(token);
				System.out.println(value);
				break;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
