package SampleProgram;

class Shape
{
	void calculateAreas()
	{
		System.out.println("Shape of area is 130");
	}
}
class Circle extends Shape
{
	void CalculateAreas()
	{
		System.out.println("Circle of area is 120");
	}
}
class Rectangle
{
	void CalculateAreas()
	{
		System.out.println("Rectangle of area is 100");
	}
}
public class Shapes 
{
	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.CalculateAreas();
		
		Rectangle r=new Rectangle();
		r.CalculateAreas();
		c.calculateAreas();
		
	}

}

class CreditCardPayment
{
	void processPayment()
	{
		System.out.println("credit card balance is 50000");
	}
}
class UPIPayment
{
	void processPayment()
	{
		System.out.println(" upi payment is credited");
	}
