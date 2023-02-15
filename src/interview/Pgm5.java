package interview;
import java.util.Scanner;
public class Pgm5 {
	static void sum(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int no=arr[i];
			
			if(no>10 && no<20)
			{
				count++;
			}
		}
			System.out.println(count);
		
	}
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the  size of array");
		 int size=sc.nextInt();
		 int arr1[]=new int[size];
		 for(int i=0;i<arr1.length;i++)
		 {
			 arr1[i]=sc.nextInt();
			 
		 }
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i]+" ");
		 }
		 System.out.println("the count is");
		 sum(arr1);
	}
}
