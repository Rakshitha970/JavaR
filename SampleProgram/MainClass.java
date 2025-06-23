package SampleProgram;

class Father
{
	int money=5000;
}
class Daughter extends Father
{
}
public class MainClass 
{

	public static void main(String[] args) 
	{
		Father f=new Father();
		System.out.println(f.money);
		

}
}
