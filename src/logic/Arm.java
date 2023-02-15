package logic;
import java.util.Scanner;
public class Arm {
static void sums(int no)
{
	int copy=no;
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+(rem*rem*rem);
	   no=no/10;
	}
	if(sum==copy)
	{
		System.out.println(copy+"Armstrong number");
	}
	else
	{
		System.out.println(copy+"not armstrong number");
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	sums(no);
}
}
