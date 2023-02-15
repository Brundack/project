package string;

public class St2 {
public static void main(String[] args) {
	String str="hello hi";
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
