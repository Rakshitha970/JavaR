package SampleProgram;

abstract class vehicle
{
	abstract void Speed();
	void brand() {
	System.out.println("Redmi");
	}
}
class bike extends vehicle
{
	@Override
	void Speed() 
	{
		System.out.println("50km/h");
	}
}
class car extends vehicle
{
	@Override
	void Speed() 
	{
		System.out.println("100km/h");
	}
}
public class Class2 
{
	public static void main(String[] args)
	{
		car c=new car();
		c.brand();
		c.Speed();
	}

}
