package SampleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOutOfIndex 
{
	public static void main(String[] args) 
	{
		  int [] a= new int[5];
		  a[0]=10;
		  a[1]=20;
		  a[2]=20;
		  a[3]=40;
		  a[4]=50;
		  System.out.println(a[8]);
		  

		}
	}


