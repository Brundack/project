package string;

public class St1 {
	public static void main(String[] args) {
		String str="hoga beda hudugi nana bittu";
		char ch[]=str.toCharArray();
		int count=0;
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
