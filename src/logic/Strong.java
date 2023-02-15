package logic;
import java.util.Scanner;
public class Strong {
static void num(int no)
{
	int copy=no;
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		int fact=1;
		for(int i=rem;i>=1;i--)
		{
		fact=fact*i;
		}
		sum=sum+fact;
		no=no/10;
	}
	if(sum==copy)
	{
		System.out.println(copy+" Strong number");
	}
	else
	{
		System.out.println(copy+" not a strong number");
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	num(no);
}
}
