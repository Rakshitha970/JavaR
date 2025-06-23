package SampleProgram;

public class sorted 
{
	public static void main(String[] args)
	{
		int arr[]= {1,5,3,10,2,7,5,9};
		System.out.print("original array: ");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i] + " ");
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]< arr[i])
				{
					temp=arr[i];
					arr[i] =arr[j];
					arr[j] =temp;
				}
			}
		}
		System.out.print("\nsorted array:");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i] + " ");
	}

}
