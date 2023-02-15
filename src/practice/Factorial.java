package practice;
import java.util.Scanner;
public class Factorial {
static int fact(int no)
{
	int fact=1;
	for(int i=no;i>=1;i--)
	{
		fact=fact*i;
	}
	return fact;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	int x=fact(no);
	System.out.println(x);
}
}
