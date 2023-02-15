package interview;

public class Pgm3 {
public static void main(String[]args)
{
	int arr[]={121,146,721,171,23632};
	for(int i=0;i<arr.length;i++)
	{
		int no=arr[i];
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
		rev=(rev*10)+rem;
			no=no/10;
		}
		if(rev==copy)
		{
			System.out.println(rev+" is pallindrome");
		}
		else
		{
			System.out.println(rev+" is not a pallindrome");
		}
	}
}
}
