package SampleProgram;

public class Propagation 
{
	public void demo()
	{
		try
		{
			IndexOfBound();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index exception occured");
		}
	}
	public void IndexOfBound() 
	{
		int[] a= {7,8,5,4,9};
		System.out.println(a[3]);
		System.out.println("My Task Completed");
	}
	public static void main(String[] args) 
	{
		Propagation p=new Propagation();
		p.IndexOfBound();
		
		

	}

}
