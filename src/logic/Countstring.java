package logic;
import java.util.Arrays;
public class Countstring {
public static void main(String[] args) {
	String str="dingadingi@123";
	int a[]=new int[122];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		a[ch]++;
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			System.out.println((char)i+" "+a[i]);
		}
	}
}
}
