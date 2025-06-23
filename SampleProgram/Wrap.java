package SampleProgram;

public class Wrap {

	public static void main(String[] args) 
	{
		String s="jf2#j4%i2@";
		int l=0,d=0,s1=0;
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			System.out.println(c1);
			if(Character.isLetter(c1))
			{
				l++;
			}
			else if(Character.isDigit(c1))
			{
				d++;
			}
			else {
				s1++;
			}
			
		}

	}

}
//String s="";
//int c1=1;
//char c2=s.charat(0);
//for(int i=0;;i<s.length();i++)
//{
	//if(c2!=s.charat(i))
	//	res=c2+c1;
//}
//c1++;
