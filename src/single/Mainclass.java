package single;
class Sample
{
	static int count=0;
	int a=10;
	static Sample s1;
	private Sample()
	{
		count++;
	}
	public static Sample getInstance()
	{
		if(count<1)
			s1=new Sample();
		return s1;
	}
	public static void setInstance(int x)
	{
		s1.a=x;
	}
}
public class Mainclass {
public static void main(String[] args) {
	Sample s2=Sample.getInstance();
	System.out.println(s2.a);
	Sample s3=Sample.getInstance();
	System.out.println(s3.a);
	Sample.setInstance(80);
	Sample s4=Sample.getInstance();
	System.out.println(s4.a);
}
}
