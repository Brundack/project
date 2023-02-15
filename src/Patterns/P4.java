package Patterns;

public class P4 {
public  static void main(String[]args)
{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=1;j--)
		{
			if(i>=j)
			{
			System.out.print(j%2);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=5;i>=1;i--)
	{
		for(int j=5;j>=1;j--)
		{
			if(i>=j)
			{
				System.out.print(j%2);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
