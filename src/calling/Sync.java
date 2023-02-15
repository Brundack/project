package calling;
class Add
{
	static int count=0;
	int a=10;
	static Add a1;
	private Add()
	{
		count++;
	}
	public static Add getInstance()
	{
		if(count<1)
			a1=new Add();
		return a1;
	}
	public static void setInstance(int x)
	{
		a1.a=x;
	}
}
public class Sync {
public static void main(String[] args) {
	Add a2=Add.getInstance();
	System.out.println(a2.a);
	Add a3=Add.getInstance();
	System.out.println(a3.a);
	Add.setInstance(90);
	Add a4=Add.getInstance();
	System.out.println(a4.a);
}
}
