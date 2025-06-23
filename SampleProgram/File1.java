package SampleProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("test.txt");
		if(f.createNewFile())
		{
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already created");
		}
		FileWriter writer=new FileWriter(f);
		writer.append("This is new text");
		writer.close();
		Scanner sc=new Scanner(f);
		int c=0;
		while(sc.hasNext())
		{
			c++;
			System.out.println(sc.next());
		}
		while(sc.hasNextLine());
		String word=sc.next();
		System.out.println(word);
		System.out.println(word.length());
		c+=word.length();
	}

}
