package Patterns;

public class P2 {
public static void main(String[]args)
{
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=5;j++)
		{
			if(i>=j)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=2;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i>=j)
			{
				System.out.print(i);
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
