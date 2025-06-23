package SampleProgram;

public class Garbage 
{
	void demo()
	{
		 Garbage g=new Garbage();
	}
	protected void finalize()
	{
		System.out.println("garbage collecter called");
	}
	public static void main(String[] args)
	{
		 Garbage g=new Garbage();
		 // unreference object called
		 g=null;
		 Garbage g1=new Garbage();
		 g=g1;
		 new Garbage();
		 System.out.println("Garbage collector started");
		 g.demo();
		 System.out.println("Garbage collector ended");
		 System.gc();
		 
		 
	}

}
