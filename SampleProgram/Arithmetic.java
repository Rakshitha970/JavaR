package SampleProgram;

import java.util.Scanner;

public class Arithmetic
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=s.nextInt();
		System.out.println("enter thye second number");
		int b=s.nextInt();
	try
	{
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
