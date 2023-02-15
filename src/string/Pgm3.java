package string;
import java.util.Arrays;
import java.util.Scanner;
class Sample {
static void sum(String str1,String str2)
{
	boolean flag=true;
	if(str1.length()==str2.length())
	{
	 char[]ch1=str1.toCharArray();
	 char[]ch2=str2.toCharArray();
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 for(int i=0;i<ch1.length;i++)
	 {
		 if(ch1[i]!=ch2[i])
		 {
			 flag =false;
			 break;
		 }
	 }
	 if(flag==true)
	 {
		 System.out.println("the string is anagram");
	 }
	 else
	 {
		 System.out.println("not anagram");
	 }
	}
	else
	{
		System.out.println("String length is not matching");
	}
}
}
public class Pgm3
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string1");
	String str1=sc.nextLine();
	System.out.println("Enter the string2");
	String str2=sc.nextLine();
	Sample.sum(str1,str2);
}
}
