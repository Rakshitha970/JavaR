package SampleProgram;

import java.util.Arrays;

enum  Brand
{
	Redmi,LG,Whirlpool,Fridge;
}
public class Enum 
{
	public static void main(String[] args)
	{
	
		Brand b=Brand.valueOf("Redmi");
		System.out.println(b);
		System.out.println(Arrays.toString(b.values()));
	}

}
