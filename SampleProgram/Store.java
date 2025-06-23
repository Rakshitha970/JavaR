package SampleProgram;

public class Store 
{
	int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	

	public static void main(String[] args) 
	{
		Store s=new Store();
		int sum=s.sum(10, 7);
		System.out.println(sum);
		
	}

}
