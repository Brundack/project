package Patterns;

public class P3 {
public static void main(String[]args)
{
	for(char i='e';i>='a';i--)
	{
		for(char j='e';j>='a';j--)
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
	for(char i='b';i<='e';i++)
	{
		for(char j='e';j>='a';j--)
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
}
}
