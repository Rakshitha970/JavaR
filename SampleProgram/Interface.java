package SampleProgram;

interface Playable
{
	void play();
}
class Guitar implements Playable
{
	public void play() 
	{
		System.out.println("play Guitar");
	}
	
}
class Piano implements Playable
{
	public void play()
	{
	System.out.println("play Piano ");	
	}
}

public class Interface 
{
	public static void main(String[] args)
	{
		Piano p=new Piano();
		p.play();
	}
}
