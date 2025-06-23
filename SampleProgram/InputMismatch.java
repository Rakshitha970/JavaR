package SampleProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}

}
