package SampleProgram;

public class Cons 
{
	String name;
	int coursePrice;
	char courseDuration;
	public Cons(String s)
	{
	name=s;
	}
	public Cons(int i) 
	{
		coursePrice=i;
	}
	public Cons(char c)
	{
		courseDuration=c;
	}
	public static void main(String[] args) 
	{
		Cons c=new Cons("Rakshitha");
		Cons c1=new Cons(25000);
		Cons c2=new Cons('6');
		System.out.println(c.name);
		System.out.println(c1.coursePrice);
		System.out.println(c2.courseDuration);
		Cons s=new Cons("Divya");
		Cons s1=new Cons(30000);
		Cons s2=new Cons('6');
		System.out.println(s.name);
		System.out.println(s1.coursePrice);
		System.out.println(s2.courseDuration);
}

}
