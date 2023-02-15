package practice;
import java.util.Scanner;
public class Max {
public static void main(String[]args)
{
	
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sum(arr);
}
static void sum(int arr[])
{
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
		max=arr[i];	
		}
	}
	System.out.println(max);
}
}
