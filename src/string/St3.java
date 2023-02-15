package string;

public class St3 {
	public static void main(String[] args) {
		String str="hoga beda hudugi nana bittu";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String s1="";
			while(i<ch.length && ch[i]!=' ')
			{
				s1=s1+ch[i];
				i++;
			}
			if(s1.length()>0)
			{
				System.out.println(s1+" "+s1.length()+"");
			}
		}
	}

}
