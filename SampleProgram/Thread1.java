package SampleProgram;

public class Thread1 extends Thread
{
	static int i=5;
	public void run()
	{
		i++;
	}
	public static void main(String[] args)
	{
		Thread1 t=new Thread1();
		t.start();
		System.out.println(i);
		System.out.println("This is Java program");
		System.out.println(i);
		i++;
		System.out.println(i);
		System.out.println(i);
		
		
		
	}

}
