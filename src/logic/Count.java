package logic;
import java.util.Arrays;
public class Count {
	public static void main(String[] args) {
		String str="hoga beda";
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
