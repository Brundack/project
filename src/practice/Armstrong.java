package practice;

public class Armstrong {
public static void main(String[] args) {
	int no=149;
	int copy=no;
	double sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+(Math.pow(rem,3));
		no=no/10;
	}
	if(sum==copy)
	{
		System.out.println(copy+" Armstrong no");
		
	}
	else
	{
		System.out.println(copy+" not a armstrong");
	}
}
}
