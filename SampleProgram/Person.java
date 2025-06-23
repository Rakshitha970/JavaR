package SampleProgram;

public class Person 
{
	String getName(String name)
	{
		String s=name;
		return s;
	}
	int getPhone(int number)
	{
		int i=number;
		return i;
	}

	public static void main(String[] args) 
	{
		Person p=new Person();
		String s=p.getName("Rakshitha");
		int i=p.getPhone(908034);
		System.out.println(s);
		System.out.println(i);
		
	}

}
