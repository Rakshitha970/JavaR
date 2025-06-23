package SampleProgram;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		System.out.println("Enter the five subjects Marks:");
		String s=sc.next();
		System.out.println(s);
		int Tamil=sc.nextInt();
		int English=sc.nextInt();
		int Maths=sc.nextInt();
		int Science=sc.nextInt();
		int Social=sc.nextInt();
		int Total=Tamil+English+Maths+Science+Social;
		int TotalMarks =(Total/500);
		System.out.println( Tamil );
		System.out.println( English );
		System.out.println( Maths );
		System.out.println( Science );
		System.out.println( Social );
		System.out.println("toatlmarks =" +Total);
		}


}

