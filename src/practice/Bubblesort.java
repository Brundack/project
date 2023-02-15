package practice;
import java.util.Scanner;
public class Bubblesort {
static void sort(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
	 a[i]=(int) sc.nextInt();
	}
	sort(a);
	
}
}
