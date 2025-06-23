package SampleProgram;

class Animal
{
	void eat()
	{
		System.out.println("i am eating food");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Boww Boww");
	}
}
class Puppy extends Dog
{
	void sound()
	{
		System.out.println("puppy puppy ");
	}
}
public  class Mutilevel 
{
	public static void main(String[] args)	
	{
		Puppy p=new Puppy ();
		p.eat();
		p.sound();
		
		
		
	}

}
