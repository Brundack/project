package practice;

public class Palstring {
public static void main(String[]args)
{
	String str="MOM";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println(" Not a Palindrome");
	
	}
}
}
