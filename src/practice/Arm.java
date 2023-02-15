package practice;

public class Arm {
void sum(int no)
{
	int copy=no;
	int sum=0;
	int mul;
	while(no!=0)
	{
		int rem=no%10;
		mul=rem*rem*rem;
		sum=sum+mul;
		no=no/10;
	}
	if(sum==copy)
	{
		System.out.println(copy+" Armstrong number");
	}
	else
	{
		System.out.println(copy+" not a  armstrongnumber");
	}
}
public static void main(String[]args)
{
	new Arm().sum(149);
}
}
