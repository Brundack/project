package practice;

public class Perfect {
public static void main(String[]args)
{
	int no=28;
	int copy=no;
	int sum=0;
	for(int i=1;i<=no/2;i++)
	{
		if(no%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==copy)
	{
		System.out.println("Perfect no");
	}
	else
	{
		System.out.println(" Not a Perfect no");
	}
}
}
