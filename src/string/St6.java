package string;
import java.util.Scanner;
public class St6 {
static void sum(String str)
{
	int arr[]=new int[122];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		arr[ch]++;
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			System.out.println((char)(i)+" "+arr[i]);
		}
	}
			
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	sum(str);
}
}
