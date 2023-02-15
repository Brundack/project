package calling;

class Sample
{
	Sample ( int a)
	{
		System.out.println("java");
	}
	Sample (String txt)
	{
		this(10);
		System.out.println("web");
	}
	Sample (int a,String txt)
	{
		this("hii");
		System.out.println("sql");
	}
	Sample (String txt,int a)
	{
		this(20,"hi");
		System.out.println("jdbc");
	}
}
public class Mainclass {
public static void main(String[] args) {
	Sample s=new Sample("hi",20);
}

}
