package interview;

public class Pgm4 {
public static void main(String[]args)
{
	int arr[]={121,146,421};
	for(int i=0;i<arr.length;i++)
	{
		int no=arr[i];
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int j=rem;j>=1;j--)
			{
			fact=fact*j;	
			}
			System.out.println(fact);
			no=no/10;
		}
	}
}
}
