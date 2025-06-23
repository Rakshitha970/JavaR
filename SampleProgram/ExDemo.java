package SampleProgram;

import java.util.Arrays;

public class ExDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[] a= {2,3,5,6,7};
			a[2]=7;
			System.out.println("Find the index " + a[2]);
			System.out.println(Arrays.toString(a));
			System.out.println(a[10]);
		}
		catch(Exception e)
		{
		System.out.println("Execption"  +e);	
		}
		System.out.println("program ended");
	}

}
