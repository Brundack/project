package practice;
import java.util.Scanner;
public class Palstrings {
static void pal(String str)
{
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not ");
	}
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
String str1=sc.nextLine();
pal(str1);
}
}
