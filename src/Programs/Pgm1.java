package Programs;

public class Pgm1 {
public static void main(String[]args)
{
	int arr[]={4,5,1,3,2};
	int min=arr[0];
	int smin=0;
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
		smin=min;
		min=arr[i];
		}
		else if(arr[i]<smin)
		{
			smin=arr[i];
			
		}
	}
	System.out.println(smin);
}
}
