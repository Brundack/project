package Programs;
import java.util.Scanner;
public class Pgm3 {
	public static void main(String[]args)
	{
		Scanner sce=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sce.nextInt();
		int arr[]=new int[size];
		System.out.println("input the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sce.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}

}
