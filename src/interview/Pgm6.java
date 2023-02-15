package interview;
import java.util.Scanner;
import java.util.Arrays;
public class Pgm6 {
static void sum(String str)
{
	char arr[]=str.toCharArray();
	Arrays.sort(arr);
	System.out.println(arr);
}
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	sum(str1);
	
}
}
