
class Animal
{
	void eat()
	{
		System.out.println("I am eating food " );
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Boww Boww");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meow Mewo");
	}
}
public class Hierarchical 
{
public static void main(String[] args) 
{
	Cat a=new Cat();
	a.eat();
	a.sound();

	
	}

}
